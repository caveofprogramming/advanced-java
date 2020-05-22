package com.caveofprogramming.db;

import java.sql.SQLException;

public class DaoException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DaoException(SQLException e) {
		super(e);
	}

}
