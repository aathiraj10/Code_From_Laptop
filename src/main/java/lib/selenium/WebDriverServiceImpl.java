package lib.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;

import lib.listeners.WebDriverListener;

public class WebDriverServiceImpl extends WebDriverListener implements WebDriverService{

	public WebElement locateElement(String locator, String locValue) {
		
		switch (locator) {
		case "id": return driver.findElement(By.id(locValue));
		
		case "name": return driver.findElement(By.name(locValue));
		
		case "class": return driver.findElement(By.className(locValue));
		
		case "link" : return driver.findElement(By.linkText(locValue));
		
		case "xpath": return driver.findElement(By.xpath(locValue));
		
		default:
			break;
		}
		return null;
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			reportSteps("The Data "+data+" is Entered Successfully", "pass");
		} catch (Exception e) {
			reportSteps("The Data "+data+" is not Entered Successfully", "fail");
		}		
	}

	public void click(WebElement ele) {
		ele.click();		
	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectDropDownUsingVisibleText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		
	}

	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		
	}

	public boolean verifyExactTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyPartialTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		try {
			String text = ele.getText();
			System.out.println(text);
			if(expectedText.equals(text))
			{
				System.out.println("The text is verified and valid");
			}
			else
			{
			System.out.println("The text is verified and invalid");
			}
		} 
		catch (RuntimeException e) {
			System.err.println("The text is not available");
		}

		
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void switchToWindow(int index) {

		try {
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> windowList = new ArrayList<String>();
			windowList.addAll(windowHandles);
			driver.switchTo().window(windowList.get(index));
			driver.manage().window().maximize();
		}
		catch (NoSuchWindowException e) {
			System.err.println("The window with index "+index+" is not available");
		}
		catch (RuntimeException e) {
			System.err.println("The window with index "+index+" is not available");
		}
		
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void closeActiveBrowser() {
		driver.close();
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		
	}

}
