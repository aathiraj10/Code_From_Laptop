package leaf.leads;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.FindLeadsPage;
import pages.MyHomePage;

public class EditLead extends PreAndPost {

	@BeforeTest
	public void setValue()
	{
		testCaseName="EditLead";
		testCaseDes="Edit Lead to Change Company Name";
		module="Lead";
		author="Aathi";
		category="smoke";
		fileName="EditLead";
		
	}
	
	@Test(dataProvider="Test")
	public void editLead(String fName, String cName) throws InterruptedException {
		
/*		click(locateElement("link", "Leads"));
		click(locateElement("link", "Find Leads"));				
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), fName);
		click(locateElement("xpath", "//button[text()='Find Leads']"));		
		WebElement leadId = locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		String searchId = leadId.getText();
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("link", "Edit"));		
		type(locateElement("id", "updateLeadForm_companyName"),cName);
		click(locateElement("class", "smallSubmit"));
		click(locateElement("link", "Find Leads"));
		System.out.println(searchId);
		type(locateElement("xpath", "//input[@name='id']"),searchId);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(2000);
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		verifyPartialText(locateElement("id", "viewLead_companyName_sp"), "TestLeaf Private Ltd");*/
		
		String resultID = new MyHomePage()
		.clickLeads()
		.clickFindLeads()
		.typeFName(fName)
		.clickFindLeadsButton()
		.getResultID();
		
		new FindLeadsPage()
		.clickFirstResult()
		.clickEdit()
		.editCompName(cName)
		.clickUpdateButton()
		.clickFindLeads()
		.typeID(resultID)
		;
		
		
		
		
		
	}
}
