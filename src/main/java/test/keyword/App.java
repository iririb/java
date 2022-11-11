package test.keyword;

public class App {
	public static void main(String[] args) {

		Automobile sedan = new Sedan("Toyota", "Yaris", 77000.0);
		System.out.println(sedan.safetyAssessmentProgram);
		
		Automobile sedan2 = new Sedan("Honda", "City", 70000.0);
		System.out.println(sedan2.safetyAssessmentProgram);
		
		System.out.println(Sedan.safetyAssessmentProgram);
		System.out.println(Automobile.safetyAssessmentProgram);
		
		// we cannot reassign the the value
		//Automobile.safetyAssessmentProgram = "Euro NACP";
		//sedan.safetyAssessmentProgram = "Euro NACP";
	}
}
