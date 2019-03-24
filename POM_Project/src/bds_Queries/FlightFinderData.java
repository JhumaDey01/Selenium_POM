package bds_Queries;

import java.util.Arrays;
import java.util.List;

public class FlightFinderData {
	static public int expectedRadioSize() {
		 int expectedRaiosize = 5;
		 return expectedRaiosize;
		 
		
	}
	static public String expectedFromPort() {
		
		return "New York";
	}
	
	static public List<String> expectedDepartListFunc() {
		List<String> expDepartList = Arrays.asList("Acapulco","Frankfurt","London","New York","Paris","Portland","San Francisco","Seattle","Sydney","Zurich");
		return expDepartList;
	}

}
