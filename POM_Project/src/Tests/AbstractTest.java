package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import UI_componenets.FlightFinderComponents;
import UI_componenets.LoginComponents;

public class AbstractTest {
	
	
	LoginComponents loginComponent;
	FlightFinderComponents flightfindercomponent;
	WebDriver driver;
	
	public AbstractTest() {
		
		loginComponent = new LoginComponents();
		flightfindercomponent = new FlightFinderComponents();
		
	}
	
	@BeforeTest
	public void setupEnvironment() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\JHUMA TUHIN\\\\Documents\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		PageFactory.initElements(driver, loginComponent);
		PageFactory.initElements(driver,flightfindercomponent);
	}
	
	@AfterTest
	public void closeEnvironment() {
		driver.close();
	}
	
	

}
