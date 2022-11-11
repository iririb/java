package test.keyword;

public class Sedan implements Automobile {

	private String make;
	private String model;
	private String price;

	public Sedan(String make, String model, String price) {
		this.make = make;
		this.model = model;
		this.price = price;
	}

	@Override
	public String getMake() {
		return make;
	}

	// private not allowed; when instantiate it's going to be public by default thus granting higher privilage is not allowed
	// protected not allowed; same with above reason
	// no access modifier also not allowed
	@Override
	public String getModel() {
		return model;
	}

	@Override
	public String getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return String.format("Make:%s, Model:%s, Price:%s", make, model, price);
	}



}
