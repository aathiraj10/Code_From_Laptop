package leaf.leads;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;
import pages.MyHomePage;
import pages.ViewLeadPage;

public class DuplicateLead extends PreAndPost {

	
	@BeforeTest
	public void setValue()
	{
		testCaseName="DuplicateLead";
		testCaseDes="Duplicate an existing lead";
		module="Lead";
		author="Aathiraj";
		category="Regression";
		fileName="DuplicateLead";
	}
	
	@Test(dataProvider="Test")
	public void duplicateLead(String email, String fName) throws InterruptedException {
		

		
		
		//div[@class='x-grid3-cell-inner x-grid3-col-firstName']
		
		/*click(locateElement("link", "Leads"));
		click(locateElement("link", "Find Leads"));		
		click(locateElement("xpath", "//span[text()='Email']"));
		type(locateElement("name", "emailAddress"), email);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		//click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));		
		click(locateElement("link", "Duplicate Lead"));
		type(locateElement("id", "createLeadForm_firstName"), fName);
		click(locateElement("class", "smallSubmit"));
		Thread.sleep(3000);
		String l = getText(locateElement("xpath", "//span[@id='viewLead_companyName_sp']"));
		System.out.println(l);
		//int leadIDLength = l.length();
		//System.out.println(leadIDLength);
		//String leadID= getText(locateElement("id", "viewLead_companyName_sp")).substring(leadIDLength-7,leadIDLength);
		click(locateElement("link", "Find Leads"));
		type(locateElement("xpath", "//input[@name='id']"), "10");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(2000);
		verifyExactText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"),fName);
*/
		
	
	new MyHomePage()
	.clickLeads()
	.clickFindLeads()
	.clickEmailOption()
	.typeEmail(email)
	.clickFindLeadsButton()
	.clickFirstResult()
	.clickDuplicate()
	.typeFirstName(fName)
	.clickCreateLead()
	//.getLeadID()
	;
	
	/*
	new ViewLeadPage(driver, test)
	.clickFindLeads()
	.typeID(leadID)
	.clickFindLeadsButton()
	.clickFirstResult();*/
	}
}
