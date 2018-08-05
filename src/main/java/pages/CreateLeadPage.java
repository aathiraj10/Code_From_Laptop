package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import cucumber.api.java.en.*;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class CreateLeadPage extends WebDriverServiceImpl {

	public CreateLeadPage()
	{
		/*this.driver=driver;
		this.test=test;*/
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="createLeadForm_companyName")
	WebElement eleCompName;

	@FindBy(id="createLeadForm_firstName")
	WebElement eleFirstName;

	@FindBy(id="createLeadForm_lastName")
	WebElement eleLastName;


	@FindBy(id="createLeadForm_primaryEmail")
	WebElement eleEmail;
	

	@FindBy(id="createLeadForm_primaryPhoneNumber")
	WebElement elePhone;
	
	@FindBy(className="smallSubmit")
	WebElement eleCreateLeadsButton;
	
	@And("Enter the Enter the CompName as (.*)")
	public CreateLeadPage typeCompName(String compName) {
		type(eleCompName,compName);
		return this;
	}
	
	@And("Enter the Enter the firstName as (.*)")
	public CreateLeadPage typeFirstName(String firstName) {
		type(eleFirstName,firstName);	
		return this;
		}

	@And("Enter the Enter the lastName as (.*)")
	public CreateLeadPage typelastName(String lastName) {
		type(eleLastName,lastName);	
		return this;
		}
	

	public CreateLeadPage typeEmail(String email) {
		type(eleEmail,email);	
		return this;
		}
	

	public CreateLeadPage typePhone(String phone) {
		type(elePhone,phone);	
		return this;
		}
	
	
	@When("Click on Create Lead button")
	public ViewLeadPage clickCreate()
	{
		click(eleCreateLeadsButton);
		return new ViewLeadPage(driver, test);
	}

@Then("New Lead must be created")
public void CreateLeadSuccess()
{
	System.out.println("Created Lead Successfully");
}


@And("Browser must be closed")
public void closeBrowser()
{
	driver.quit();
}
}

