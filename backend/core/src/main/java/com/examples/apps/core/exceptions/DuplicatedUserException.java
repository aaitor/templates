package com.examples.apps.core.exceptions;

/**
 * Thrown when trying to create an already existing entity
 */
@SuppressWarnings("serial")
public class DuplicatedUserException extends Exception {
	
	private String id;
	
	public DuplicatedUserException(String id)	{
		this.id= id;
	}

	/**
	 * {@inheritDoc}}
	 */
	@Override
	public String getMessage()	{
		return "Already exists an User with ID = " + id;
	}
}
