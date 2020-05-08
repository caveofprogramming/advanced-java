package application;

import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.sqlite.JDBC");
		
		String dbUrl = "jdbc:sqlite:people.db";
		
		var conn = DriverManager.getConnection(dbUrl);
		
		System.out.println(conn);
		
		conn.close();

	}

}
