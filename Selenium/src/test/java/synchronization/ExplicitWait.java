package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
	@Test
	public void Explicit_wait()

	{
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");

		FirefoxOptions opt = new FirefoxOptions();
		opt.setLogLevel(FirefoxDriverLogLevel.INFO);
		WebDriver driver = new FirefoxDriver(opt);
		driver.get("https://corpository.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		WebElement Signin = driver.findElement(By.xpath("//a[text() = 'Sign In']"));

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Signin));
		Signin.click();
		String message = driver.getTitle();
		System.out.println(message);
		driver.close();
	}

}
