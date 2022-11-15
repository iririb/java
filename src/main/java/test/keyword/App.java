package test.keyword;

public class App {
	public static void main(String[] args) {

		
		Automobile sedan = new Sedan("Honda", "Civic", 77000.0);
		System.out.println(sedan);
		// here the get release will use the default method as it was not redefined in the Sedan class
		System.out.println(sedan.getReleaseDate());
		
		
	}
}
