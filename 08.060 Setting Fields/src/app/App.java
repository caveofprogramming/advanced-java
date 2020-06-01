package app;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Date;

class User {	
	public int id;
}

class Employee extends User {
	public String name;
	private String password;
	
	private boolean setUpdated(int sequence) {
		System.out.println("setUpdated: " + sequence);
		return true;
	}
}

public class App {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class<Employee> clazz = Employee.class;
		
		var nameField = clazz.getField("name");
		
		System.out.println(nameField);
		
		var setUpdatedMethod = clazz.getDeclaredMethod("setUpdated", int.class);
		setUpdatedMethod.setAccessible(true);
		
		setUpdatedMethod.invoke(new Employee(), 7);
	}

}
