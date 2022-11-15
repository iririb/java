package test.keyword;

import java.sql.ResultSet;

public class App {
	public static void main(String[] args) {

		ClassLoader bootStrapClassLoader = String.class.getClassLoader();
		System.out.println(bootStrapClassLoader);
		
		ClassLoader platformClassLoader = ResultSet.class.getClassLoader();
		System.out.println(platformClassLoader);
		System.out.println(platformClassLoader.getParent());
		
		ClassLoader appClassLoader = Employee.class.getClassLoader();
		System.out.println(appClassLoader);
		System.out.println(appClassLoader.getParent());
		System.out.println(appClassLoader.getParent().getParent());
		
	}
}
