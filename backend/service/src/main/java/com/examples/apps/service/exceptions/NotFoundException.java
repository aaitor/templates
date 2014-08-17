package com.examples.apps.service.exceptions;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.examples.apps.service.Error;

@SuppressWarnings("serial")
public class NotFoundException extends WebApplicationException{
	
	public NotFoundException(Exception ex)	{
		super(Response.status(Status.NOT_FOUND).entity(
				new Error(Status.NOT_FOUND.getStatusCode(), ex.getMessage())).build());				
	}
}