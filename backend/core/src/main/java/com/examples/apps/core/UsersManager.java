package com.examples.apps.core;

import java.util.List;

import com.examples.apps.core.exceptions.DuplicatedUserException;
import com.examples.apps.core.exceptions.NoSuchUserException;
import com.examples.apps.core.model.User;

public interface UsersManager {

	/**
	 * Create a new User
	 * @param user
	 * @return The user created
	 * @throws DuplicatedUserException If the user already exists in the datastore
	 */
	User create(User user) throws DuplicatedUserException;
	
	/**
	 * Loads a User with a given ID
	 * @param id
	 * @return The User with the given ID
	 * @throws NoSuchUserException
	 */
	User loadById(String id) throws NoSuchUserException;
	
	/**
	 * Create or updates a certain User
	 * @param user
	 * @return The modified User
	 */
	User update(User user);
	
	/**
	 * Deletes a certain User
	 * @param id
	 * @throws NoSuchUserException
	 */
	void delete(String id) throws NoSuchUserException;
	
	/**
	 * Gets a list of Users given their Ids
	 * @param ids List of IDs
	 * @return A list of Users with the given IDs. An empty list will be returned
	 * id no USers match the given criteria
	 */
	User getUsersById(List<String> ids);
	
}