package test.keyword;

import java.sql.ResultSet;

public class App {
	public static void main(String[] args) throws ClassNotFoundException {

		// we pass something not exist
		// this will cause error
		// Class<?> someClass = Class.forName("test.keyword.notexist", true, Employee.class.getClassLoader());	
		
		ClassLoader appClassLoader = Employee.class.getClassLoader();
		System.out.println(appClassLoader);
		ClassLoader platformClassLoader = appClassLoader.getParent();
		System.out.println(platformClassLoader);

		// when not sure use ? mark
		Class<?> someApplicationClass = appClassLoader.loadClass("org.json.JSONObject");
		System.out.println(someApplicationClass);
		
		// however below will cause error because JSONObject not in platform area
		// someApplicationClass = platformClassLoader.loadClass("org.json.JSONObject");
		// System.out.println(someApplicationClass);
		
		// however this wont be an issue because app class loader will cover much more object
		someApplicationClass = appClassLoader.loadClass("java.sql.ResultSet");//ResultSet is a platform class loader
		System.out.println(someApplicationClass);
		
	}
}
