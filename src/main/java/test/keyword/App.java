package test.keyword;

import java.net.http.HttpClient;
import java.sql.ResultSet;

import java.util.ArrayList;

import org.json.JSONObject;

public class App {
	public static void main(String[] args) {

		// this will load from app class loader
		System.out.println("Class loader: " + Employee.class.getClassLoader());
		
		// these will load from platform class loader
		System.out.println("Class loader: " + ResultSet.class.getClassLoader());
		System.out.println("Class loader: " + HttpClient.class.getClassLoader());
		
		// this will load bootstrap class loader
		System.out.println("Class loader: " + ArrayList.class.getClassLoader());
		// however the result will be null
		
		// here we readng the class loader of imported jar file(Refer Referenced Library folder)
		// this will also load from app class loader
		System.out.println("Class loader: " + JSONObject.class.getClassLoader());
		
	}
}
