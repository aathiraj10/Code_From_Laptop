/*package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class CreateLeadSteps {
	ChromeDriver driver;
	
	
@Given("Launch the browser")
public void launchBrowser()
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver = new ChromeDriver();
}

@And("Maximize the opened browser")
public void maximizeBrowser()
{
	driver.manage().window().maximize();
}

@And("Navigate to the url")
public void launchURL()
{
	driver.get("http://leaftaps.com/opentaps");
}

@And("Enter the password")
public void typeUserName()
{
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
}

@And("Enter the username")
public void typePassword()
{
	driver.findElement(By.id("password")).sendKeys("crmsfa");
}

@And("Click on the login button")
public void clickLogin()
{
	driver.findElement(By.className("decorativeSubmit")).click();
}

@And("Click on CRMSFA link")
public void clickCRMSFA()
{
	driver.findElement(By.linkText("CRM/SFA")).click();
}

@And("Click on Leads")
public void clickLeads()
{
	driver.findElement(By.linkText("Leads")).click();
}

@And("Click on Create Lead")
public void clickCreateLead()
{
	driver.findElement(By.linkText("Create Lead")).click();
}

@And("Enter the Enter the CompName as (.*)")
public void typeCompName(String cName)
{
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
}


@And("Enter the Enter the firstName as (.*)")
public void typeFirstName(String fName)
{
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	
}

@And("Enter the Enter the lastName as (.*)")
public void typeLastName(String lName)
{
	
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	
	
}


@When("Click on Create Lead button")
public void clicksubmit()
{
	driver.findElement(By.className("smallSubmit")).click();
}

@Then("New Lead must be created")
public void CreateLeadSuccess()
{
	System.out.println("Created Lead Successfully");
}


@Then("Lead must not be created")
public void CreateLeadFailure()
{
	System.out.println("No lead created as mandate field is empty");
}


@And("Browser must be closed")
public void closeBrowser()
{
	driver.quit();
}
}
*/