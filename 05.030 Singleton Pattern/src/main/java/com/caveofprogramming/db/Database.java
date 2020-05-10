package com.caveofprogramming.db;

public class Database {
	private static Database db = new Database();
	
	public static Database instance() {
		return db;
	}
	
	private Database() {
		
	}
}
