package com.caveofprogramming.db;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserDaoImplTest {
	
	private Connection conn;
	
	@Before
	public void setUp() throws SQLException {
		var props = Profile.getProperties("db");
		
		var db = Database.instance();
		
		db.connect(props);
		
		conn = db.getConnection();
		conn.setAutoCommit(false);
	}
	
	@After
	public void tearDown() throws SQLException {
		Database.instance().close();
	}
	
	@Test
	public void testSave() throws SQLException {
		User user = new User("Jupiter");
		
		UserDao userDao = new UserDaoImpl();
		
		userDao.save(user);
		
		var stmt = conn.createStatement();
		
		var rs = stmt.executeQuery("select id, name from user order by id desc");
		
		var result = rs.next();
		
		assertTrue("cannot retrieve inserted user", result);
		
		var name = rs.getString("name");
		
		assertEquals("user name doesn't match retrieved", user.getName(), name);
		
		stmt.close();
		
	}
}
