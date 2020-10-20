package browserfactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DisableExtension {

	@Test
	public void disableext() {
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");
		FirefoxOptions opt = new FirefoxOptions();
		opt.addArguments("--disable-extensions");
		WebDriver driver = new FirefoxDriver(opt);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		WebElement search = driver.findElement(By.xpath("//input[@name = 'q']"));
		search.sendKeys("Hello");

		driver.close();

	}

}
