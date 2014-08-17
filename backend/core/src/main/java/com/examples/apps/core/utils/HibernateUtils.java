package com.examples.apps.core.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtils {

	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	
	public static SessionFactory createSessionFactory()	{
		try {
			// Create the SessionFactory form hibernate.cfg.xml
			Configuration configuration= new Configuration();
			configuration.configure();
			serviceRegistry= new StandardServiceRegistryBuilder().applySettings(
					configuration.getProperties() ).build();
			sessionFactory= configuration.buildSessionFactory(serviceRegistry);
			
		} catch (Throwable ex)	{
			System.err.println("Initial SessionFactory creation failed. " + ex);
			throw new ExceptionInInitializerError(ex);
		}
		return sessionFactory;
	}
	
	public static SessionFactory getSessionFactory()	{
		return sessionFactory;
	}
}