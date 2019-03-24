package UI_componenets;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bds_Queries.FlightFinderData;

public class FlightFinderComponents {
	
	@FindBy(xpath="//input[@value='oneway']")
	WebElement triptypeRadio;
	
	@FindBy(xpath="//select[@name='passCount']/option[@value='2']")
	WebElement passengersDropDown;
	
	@FindBy(xpath="//select[@name='fromPort']/option[@value='New York']")
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
	static List<WebElement> radioList ;
	
	@FindBy(xpath="//input[@value='Business']")
	WebElement serveClass;
	
	@FindBy(xpath="//select[@name='fromPort']")
	List<WebElement> departFrom;
	
	public int sizeOfRadio() {
		int actualRadiosize = radioList.size();
		System.out.println(actualRadiosize);
		return actualRadiosize;
		
	}
	
	public boolean verifyRadioSizeFunc() {
			
		int actualRadiosize =sizeOfRadio();
		int expectedRadiosize = FlightFinderData.expectedRadioSize();
		
		if(actualRadiosize== expectedRadiosize)
			return true;
		else
			return false;
				
	}
	
	public void selectFromPort() {
		departingFromDropDown.click();
		
	}
	
	public boolean verifyFromPortSelect() {
		selectFromPort();
		String actualValue = departingFromDropDown.getText();
		String expectedValue = FlightFinderData.expectedFromPort();
		if(actualValue.equals(expectedValue))
			return true;
		else
			return false;
		
	}
	
	public void selectServeClass()
	{
		serveClass.click();
	}
	
	public boolean verifyServeClassFunc() {
		selectServeClass();
		String str = serveClass.getAttribute("checked");
		if(str.equalsIgnoreCase("true"))
			return true;
		else
			return false;
	}
	
	public List<String> departFromListFun() {
		List<String> actualList = new ArrayList<String>();
		for(int i=0; i<departFrom.size();i++) {
			
			System.out.println(departFrom.get(i).getText());
			actualList.add(departFrom.get(i).getText());
			
			
		}
		return actualList;
	}
	
	

}
