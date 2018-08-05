package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.*;
import lib.selenium.WebDriverServiceImpl;


public class HooksFile extends WebDriverServiceImpl {

	//public static WebDriver driver= null;
	
	
@Before
public void beforeScenario(Scenario sc)
	{
	startReport();
	startTestCase(sc.getName(), sc.getId());
	startTestModule("Leads");
	test.assignAuthor("Aathi");
	test.assignCategory("smoke");
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	webdriver = new ChromeDriver();
	driver = new EventFiringWebDriver(webdriver);
	driver.register(this);
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	type(locateElement("id", "username"), "DemoSalesManager");	
	type(locateElement("id", "password"), "crmsfa");
	click(locateElement("class", "decorativeSubmit"));
	click(locateElement("link", "CRM/SFA"));

	
	}

@After
public void afterScenario(Scenario sc)
	{
	//closeActiveBrowser();
	endResult();
	}
	
	
}
