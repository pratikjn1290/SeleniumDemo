package seleniumAdvanceActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick {
	@Test
	public void right_click() {

		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");

		WebElement language = driver.findElement(By.xpath("//a[text() = 'हिन्दी']"));

		//Performs right click on locator
		Actions act = new Actions(driver);
		act.contextClick(language).perform();

		driver.close();
	}

}
