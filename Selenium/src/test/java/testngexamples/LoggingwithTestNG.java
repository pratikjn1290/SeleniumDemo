package testngexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoggingwithTestNG {
	
	
	@Test
	public void test()
	
	{
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");
		Reporter.log("Browser Opening...");
		WebDriver driver = new FirefoxDriver();
		Reporter.log("Firefox Browser Opened");
		driver.get("https://www.google.com");
		Reporter.log("Application Opening...");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement elem = driver.findElement(By.name("q"));
		String s1 = driver.getTitle();
		Reporter.log("Title of Page" +s1);
		elem.sendKeys("Hello Google");
		
		driver.close();
		Reporter.log("Browser Closed");
	}
	

}
