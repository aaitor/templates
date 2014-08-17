package com.examples.apps.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

import org.apache.log4j.Logger;

import com.examples.apps.core.UsersManager;
import com.examples.apps.core.exceptions.NoSuchUserException;
import com.examples.apps.core.model.User;
import com.examples.apps.service.exceptions.GenericErrorException;
import com.examples.apps.service.exceptions.NotFoundException;

/** Example resource class hosted at the URI path "/users"
 */
@Path("/api/v1/users/")
public class UsersResource {
    
	private static final Logger LOGGER = Logger.getLogger(UsersResource.class.getName());
	private UsersManager manager;
	
	/**
	 * Constructor
	 * @param manager Manager to use to access the model
	 */
	public UsersResource(UsersManager manager)	{
		this.manager= manager;
	}
	
	/**
	 * Returns a User object
	 * @return Response containing a User object
	 */
	@GET
	@Path("/user/{id}")
	@Produces({
		MediaType.APPLICATION_JSON + Constants.CHARSET_UTF8,
		MediaType.TEXT_XML + Constants.CHARSET_UTF8
		})
	public Response getUser(@PathParam("id") final String id)	{
		try {
			User user= manager.loadById(id);
			
			ResponseBuilder builder = Response.status(Status.OK).entity(user);
			return builder.build();
		} catch (NoSuchUserException ex)	{
			throw new NotFoundException(ex);
		} catch (Exception ex)	{
			LOGGER.error(ex);
			throw new GenericErrorException(ex);
		} finally {
			
		}
	}
}