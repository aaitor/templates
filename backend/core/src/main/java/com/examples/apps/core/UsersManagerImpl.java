package com.examples.apps.core;

import java.util.List;

import com.examples.apps.core.dao.DatastoreDao;
import com.examples.apps.core.exceptions.DuplicatedUserException;
import com.examples.apps.core.exceptions.NoSuchUserException;
import com.examples.apps.core.model.User;

public class UsersManagerImpl implements UsersManager {

	DatastoreDao dao;
	
	public UsersManagerImpl(DatastoreDao dao)	{
		this.dao= dao;
	}
	
	@Override
	public User create(User user) throws DuplicatedUserException {
		dao.create(user);
		return user;
	}

	@Override
	public User loadById(String id) throws NoSuchUserException {
		User user= (User) dao.loadById(User.class, id);
		return user;
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) throws NoSuchUserException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUsersById(List<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}
	
}