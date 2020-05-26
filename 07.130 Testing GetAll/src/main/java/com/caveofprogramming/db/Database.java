package com.caveofprogramming.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Database {
	private static Database db = new Database();
	private Connection conn;

	public static Database instance() {
		return db;
	}

	private Database() {

	}

	public Connection getConnection() {
		return conn;
	}

	public void connect(Properties props) throws SQLException {
		String server = props.getProperty("server");
		String port = props.getProperty("port");
		String database = props.getProperty("database");
		String user = props.getProperty("user");
		String password = props.getProperty("password");
		
		String url = String.format("jdbc:mysql://%s:%s/%s?serverTimezone=UTC", server, port, database);

		conn = DriverManager.getConnection(url, user, password);
	}

	public void close() throws SQLException {
		conn.close();
	}
}
