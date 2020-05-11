package com.caveofprogramming.db;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		var db = Database.instance();
		
		try {
			db.connect();
		} catch (SQLException e) {
			System.out.println("Cannot connect to database.");
		}
		
		System.out.println("Connected");
		
		
		try {
			db.close();
		} catch (SQLException e) {
			System.out.println("Cannot close database connection.");
		}
		
	}
}
