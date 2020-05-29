package app;

import java.util.Arrays;

class User {	
	public int id;
}

class Employee extends User {
	public String name;
	
	private String password;
}

public class App {

	public static void main(String[] args) {

		Class<Employee> clazz = Employee.class;
		
		System.out.println(Arrays.asList(clazz.getFields()));
		
		System.out.println(Arrays.asList(clazz.getDeclaredFields()));
		
	}

}
