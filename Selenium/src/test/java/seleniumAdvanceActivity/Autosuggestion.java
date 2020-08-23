package seleniumAdvanceActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Autosuggestion {

	@Test
	public void AutoSuggestionBox() throws Exception

	{

		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		
		WebElement Job = driver.findElement(By.xpath("//input[@id = 'qsb-keyword-sugg']"));
		Job.sendKeys("Test");

		//Perform autosuggestion activity
		Actions act = new Actions(driver);
		act.moveToElement(Job).build().perform();

		act.click(Job).build().perform();

		Thread.sleep(30000);

		driver.close();

	}

}
