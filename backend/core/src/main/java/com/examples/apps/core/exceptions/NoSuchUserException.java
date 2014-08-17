package com.examples.apps.core.exceptions;

/**
 * Thrown when trying to retrieve a not existing User
 */
@SuppressWarnings("serial")
public class NoSuchUserException extends Exception {
	
	private String id;
	
	public NoSuchUserException(String id)	{
		this.id= id;
	}

	/**
	 * {@inheritDoc}}
	 */
	@Override
	public String getMessage()	{
		return "No User found with ID = " + id;
	}
}
