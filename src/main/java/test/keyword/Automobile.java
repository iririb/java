package test.keyword;

import java.util.Calendar;

// usally once we have create/deploy the project, we no longer add a new method into interface as it will cause issue to all class that implement that interface
public interface Automobile {
	
	String safetyAssessmentProgram = "Global NCAP";
	
	String getMake();
	
	String getModel();
	
	Double getPrice();
	
	static String getFormattedCalendarString() {
		Calendar now = Calendar.getInstance();		
		return String.format("%s-%s-%s", now.get(Calendar.MONTH),now.get(Calendar.DAY_OF_MONTH),now.get(Calendar.YEAR));

	}
	// however if we going to add a new method, we can implement using the keyword default
	// using this method it will not cause other class that already impelent this interface error
	default String getReleaseDate() {
		return getFormattedCalendarString();
	}

}
