package windowandframes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HighlightTheElement {

	@Test
	public void highlightelemnt() {
		
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement search = driver.findElement(By.xpath("//input[@name = 'q']"));

		js.executeScript("arguments[0].setAttribute('style','border: solid 2px red');", search);

		search.sendKeys("Hello QA People");

		driver.close();
	}
}
