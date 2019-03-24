package UI_componenets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bds_Queries.loginData;

public class LoginComponents {
	
	@FindBy(name="userName")
	WebElement usernameEditbox;
	
	@FindBy(name="password")
	WebElement passwordEditbox;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement loginButton;
	
	@FindBy(xpath="//img[@src='/images/masts/mast_flightfinder.gif']/following::font[1]")
	WebElement loginverificationText;
	
	public void login() {
		usernameEditbox.sendKeys("batman");
		passwordEditbox.sendKeys("batman");
		loginButton.click();
		
	}
	
	public boolean verifyLoginFunc() {
		
		String actualText = loginverificationText.getText();
		String expectedText = loginData.loginExpectedText();
		if(actualText.equals(expectedText))
			return true;
		else
			return false;

	}
	
	

}
