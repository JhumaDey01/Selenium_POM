package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import bds_Queries.FlightFinderData;

public class FlightFinderTest extends AbstractTest {
	
	@Test(description ="Verify size of Radio", priority =0)
	public void verifyRadioSize()
	{
		loginComponent.login();
		assertTrue(loginComponent.verifyLoginFunc(), "Verify Login");
		assertTrue(flightfindercomponent.verifyRadioSizeFunc(),"Verify Radio Size");
	}
	
	@Test(description="Verify New York is Selected in From Port", priority=1)
	public void verifyNewYorkIsSelected() {
		//loginComponent.login();
		//assertTrue(loginComponent.verifyLoginFunc(), "Verify Login");
		assertTrue(flightfindercomponent.verifyFromPortSelect(),"verify from Port selection");
		
	}
	
	@Test(description="Verify Business Class is selected in Serve Class",priority =2)
	public void verifyBusinessClassIsSelected() {
		//loginComponent.login();
		//assertTrue(loginComponent.verifyLoginFunc(), "Verify Login");
		assertTrue(flightfindercomponent.verifyServeClassFunc()," verify Serve Class Selection");
		
	}
	@Test(priority=3)
	public void verifyDepartFromListVal() {
		assertEquals(flightfindercomponent.departFromListFun(),FlightFinderData.expectedDepartListFunc(),"verify Drop down List");
	}

}
