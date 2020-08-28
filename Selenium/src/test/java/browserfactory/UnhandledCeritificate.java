package browserfactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class UnhandledCeritificate {

	@Test
	public void unhandlecertfirefox()

	{

		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");
		FirefoxOptions opt = new FirefoxOptions();
		opt.setAcceptInsecureCerts(true);
		WebDriver driver = new FirefoxDriver(opt);
		driver.get("https://learn-automation.com/selenium-interview-questions-and-answers/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.close();
	}

	@Test
	public void unhandlecertchrome()

	{

		new DesiredCapabilities();
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(cap);
		driver.get("https://learn-automation.com/selenium-interview-questions-and-answers/");
		driver.manage().window().maximize();

		driver.close();
	}

}
