package interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver.navigate().to("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//i[@class='icon-hotels db blue ico28 lh1-2 padT2 padB3']")).click();
	driver.findElement(By.xpath("//input[@id='gosuggest_inputL']")).sendKeys("Pondicherry",Keys.ARROW_DOWN,Keys.ENTER);
	//driver.findElement(By.xpath("//input[@id='gosuggest_inputL']")).sendKeys(Keys.ARROW_DOWN);
	//driver.findElement(By.xpath("//input[@id='gosuggest_inputL']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement inputbox = driver.findElement(By.id("gosuggest_inputL"));
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ARROW_DOWN);
		a.sendKeys(Keys.ENTER);
		//a.moveToElement(inputbox).click().perform();
		/*
		Select obj = new Select(inputbox);
		obj.selectByIndex(0);
		*///driver.findElement(By.xpath(""))
		//driver.close();

	}

}
