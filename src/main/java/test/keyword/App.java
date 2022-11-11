package test.keyword;

public class App {
	public static void main(String[] args) {

		Automobile huracan = new Lamborghini("Huracan", 1200000.0);
		SportsCar aventador = new Lamborghini("Aventador", 1220000.0);

		System.out.println(huracan);
		System.out.println(aventador);

		System.out.println(huracan instanceof Lamborghini);
		System.out.println(huracan instanceof SportsCar);
		System.out.println(huracan instanceof Automobile);
		
		System.out.println(aventador instanceof Lamborghini);
		System.out.println(aventador instanceof SportsCar);
		System.out.println(aventador instanceof Automobile);

	}
}
