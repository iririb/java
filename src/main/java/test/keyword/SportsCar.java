package test.keyword;

public interface SportsCar{
	float getTopSpeed();
	
	// add method similar to Automobile
	String getModel();
	
	// however is we have another similar method with Automobile but different in type will cause an error
	Integer getPrice();
}
