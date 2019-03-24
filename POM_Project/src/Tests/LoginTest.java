package Tests;



import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LoginTest extends AbstractTest {
	
	
	@Test(description="Verify Login")
	public void verifyLogin() {
		loginComponent.login();
		assertTrue(loginComponent.verifyLoginFunc(), "Verify Login");
	}

}
