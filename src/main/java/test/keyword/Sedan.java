package test.keyword;

// because we implements Automobile thus we need to create all methods from Automobile 
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
		// TODO Auto-generated method stub
		return make;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public String toString() {
		return String.format("Make:%s, Model:%s, Price:%s", make, model, price);
	}

}
