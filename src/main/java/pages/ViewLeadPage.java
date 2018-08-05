package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class ViewLeadPage extends WebDriverServiceImpl {

	public ViewLeadPage(EventFiringWebDriver driver, ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Edit")
	WebElement eleEdit;

	@FindBy(linkText="Find Leads")
	WebElement eleFindLeads;
	
	@FindBy(linkText="Duplicate Lead")
	WebElement eleDupLeads;
	
	@FindBy(id="viewLead_firstName_sp")
	WebElement eleFname;
	
	@FindBy(id="viewLead_companyName_sp")
	WebElement eleCompName;
	
	
	
	public EditableLeadPage clickEdit() {
		click(eleEdit);
		return new EditableLeadPage();
	}
	public FindLeadsPage clickFindLeads() {
		click(eleFindLeads);
		return new FindLeadsPage();
	}
	public DuplicateLeadPage clickDuplicate() {
		click(eleDupLeads);
		return new DuplicateLeadPage();
	}	

	

	public ViewLeadPage verifyFirstName(String firstName) {
		verifyExactText(eleFname,firstName);
		return this;
	}
	
	public String getLeadID() {
		String cName=getText(eleCompName);
		int length = cName.length();
		String leadID=cName.substring(length-5, length-1);
		return leadID;
	}
	
}

