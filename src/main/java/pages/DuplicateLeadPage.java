package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class DuplicateLeadPage extends WebDriverServiceImpl {

	public DuplicateLeadPage()
	{
		/*this.driver=driver;
		this.test=test;
		*/
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(id="createLeadForm_firstName")
	WebElement eleFirstNameEdit;
	
	@FindBy(className="smallSubmit")
	WebElement eleCreateLeadButton;
	
	public DuplicateLeadPage typeFirstName(String fName)
	{
		type(eleFirstNameEdit, fName);
		return this;
	}
	
	public ViewLeadPage clickCreateLead()
	{
		click(eleCreateLeadButton);;
		return new ViewLeadPage(driver, test);
	}
}
