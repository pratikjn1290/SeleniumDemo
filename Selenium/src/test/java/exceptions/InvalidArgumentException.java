// org.openqa.selenium.InvalidArgumentException: invalid argument

package exceptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvalidArgumentException {

	@Test
	public void WebDriverExceptions() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pratik\\git\\SeleniumDemo\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("htts://www.google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Hello");
		driver.close();
	}

}
