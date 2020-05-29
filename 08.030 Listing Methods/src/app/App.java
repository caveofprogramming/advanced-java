package app;

import java.util.Arrays;

class User {	
	public int id;
}

class Employee extends User {
	public String name;
	private String password;
	
	private void calculate() {
		
	}
}

public class App {

	public static void main(String[] args) {

		Class<Employee> clazz = Employee.class;
		
		System.out.println(Arrays.asList(clazz.getFields()));
		System.out.println(Arrays.asList(clazz.getDeclaredFields()));
		
		System.out.println();
		
		Arrays.asList(clazz.getMethods()).forEach(System.out::println);
		
		System.out.println();
		
		Arrays.asList(clazz.getDeclaredMethods()).forEach(System.out::println);
		
		
	}

}
