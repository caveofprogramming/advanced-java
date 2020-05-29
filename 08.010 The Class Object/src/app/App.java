package app;

class User {
	
}

class Employee extends User {
	
}

public class App {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class<Employee> clazz1 = Employee.class;
		
		System.out.println(clazz1);
		
		Class<?> clazz2 = Class.forName("app.Employee");
		
		System.out.println(clazz2);
		
		User u = new Employee();
		
		Class<? extends User> clazz3 = u.getClass();
		
		System.out.println(clazz3);
	}

}
