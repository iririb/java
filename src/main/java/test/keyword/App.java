package test.keyword;

public class App {
	public static void main(String[] args) {

		Automobile huracan = new Lamborghini("Huracan", 1200000.0, 320, "2014");
		System.out.println(huracan);
		
		// if we change the object to SportsCar will cause error as getReleaseDate is from Automobile
		// System.out.println(huracan.getReleaseDate());

		// changing back the object to Automobile to test for override default method
		System.out.println(huracan.getReleaseDate());
		
		Automobile sedan = new Sedan("Honda", "Civic", 77000.0);
		System.out.println(sedan);
		// here the get release will use the default method as it was not redefined in the Sedan class
		System.out.println(sedan.getReleaseDate());
		
		
	}
}
