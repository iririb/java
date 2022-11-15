package test.keyword;

// inheritance abstract class not allowed but multiple interface inheritance is allowed
public class Lamborghini implements SportsCar, Automobile{

	private String make;
	private String model;
	private Double price;
	private float topSpeed;
	private String releaseDate;
	
	public Lamborghini(String model, Double price, float topSpeed, String releaseDate) {
		this.make = "Lamborghini";
		this.model = model;
		this.price = price;
		this.topSpeed = topSpeed;
		this.releaseDate = releaseDate;
	}
	
	// if we dont want to depend on default method we can redefine here
	@Override
	public String getReleaseDate() {
		return releaseDate;
	}
	
	@Override
	public String getMake() {
		return make;
	}

	@Override
	public String getModel() {
		return model;
	}

	@Override
	public Double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return String.format("Make:%s, Model:%s, Price:%s, TopSpeed:%s", make, model, price, topSpeed);
	}
	@Override
	public float getTopSpeed() {
		return topSpeed;
	}



}
