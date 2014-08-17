package com.examples.apps.service.exceptions;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.examples.apps.service.Error;

@SuppressWarnings("serial")
public class GenericErrorException extends WebApplicationException{
	
	public GenericErrorException(Exception ex)	{
		super(Response.status(Status.INTERNAL_SERVER_ERROR).entity(
				new Error(Status.INTERNAL_SERVER_ERROR.getStatusCode(), ex.getMessage())).build());				
	}
}