package com.caveofprogramming.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private static Database db = new Database();
	private static final String URL = "jdbc:mysql://localhost:3306/people?serverTimezone=UTC";
	private Connection conn;

	public static Database instance() {
		return db;
	}

	private Database() {

	}
	
	public Connection getConnection() {
		return conn;
	}

	public void connect() throws SQLException {
		conn = DriverManager.getConnection(URL, "root", "hello");
	}

	public void close() throws SQLException {
		conn.close();
	}
}
