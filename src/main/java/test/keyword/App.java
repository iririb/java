package test.keyword;

public class App {
	public static void main(String[] args) {

		Automobile sedan2 = new Sedan("Toyota", "Yaris", "77000");

		System.out.println(sedan2.getMake());
		System.out.println(sedan2.getModel());
		System.out.println(sedan2.getPrice());

		System.out.println(sedan2);

		System.out.println(sedan2 instanceof Sedan);// true
		System.out.println(sedan2 instanceof Automobile);// true
	}
}
