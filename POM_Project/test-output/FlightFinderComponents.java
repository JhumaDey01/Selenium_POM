package UI_componenets;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightFinderComponents {
	
	@FindBy(xpath="//input[@value='oneway']")
	WebElement triptypeRadio;
	
	@FindBy(xpath="//select[@name='passCount']/option[@value='2']")
	WebElement passengersDropDown;
	
	@FindBy(xpath="//select[@name='fromPort']/option[@value='London']")
	WebElement departingFromDropDown;
	
	@FindBy(xpath="//select[@name='fromMonth']/option[@value='4'")
	WebElement fromMonthDropDown;
	
	@FindBy(xpath="//select[@name='fromDay']/option[@value='4']")
	WebElement fromDayDropDown;
	
	@FindBy(xpath="//select[@name='toPort']/option[@value='Frankfurt']")
	WebElement arrivingInDropDown;
	
	@FindBy(xpath="//select[@name='toMonth']/option[@value='5']")
	WebElement toMonthDropDown;
	
	@FindBy(xpath="//select[@name='toDay']/option[@value='10']")
	WebElement toDayDropDown;
	
	@FindBy(xpath="//input[@type='radio']")
	List<WebElement> radioList ;
	
	

}
