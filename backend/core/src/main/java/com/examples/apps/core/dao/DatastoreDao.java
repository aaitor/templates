package com.examples.apps.core.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import com.examples.apps.core.utils.HibernateUtils;

public class DatastoreDao {

	private static final Logger LOGGER = Logger.getLogger(DatastoreDao.class);
	private static Session session;
	
	public DatastoreDao()	{
		session= HibernateUtils.getSessionFactory().getCurrentSession();
	}
	
	public Session getSession()	{
		return session;
	}
	
	public void create(Object obj)	{
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();		
	}
	
	public Object loadById(Class objClass, String id)	{
		return session.load(objClass, id);
	}
}
