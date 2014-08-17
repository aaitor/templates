package com.examples.apps.core;

import static org.junit.Assert.*;

import org.junit.Test;

import com.examples.apps.core.exceptions.DuplicatedUserException;
import com.examples.apps.core.exceptions.NoSuchUserException;

/**
 * Tests for {@link UsersManagerImpl} class
 *
 */
public class UsersManagerImplTest {

	@Test
	public void testCreate() throws Exception {
		fail("Not yet implemented");
	}

	@Test(expected = DuplicatedUserException.class)
	public void testCreateDuplicatedUser() throws Exception {
		fail("Not yet implemented");
	}	
	
	@Test
	public void testLoadById() throws Exception {
		fail("Not yet implemented");
	}

	@Test(expected = NoSuchUserException.class)
	public void testLoadNoSuchUserById() throws Exception {
		fail("Not yet implemented");
	}	

	@Test
	public void testUpdate() throws Exception {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDelete() throws Exception {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetUsersById() throws Exception {
		fail("Not yet implemented");
	}	
}
