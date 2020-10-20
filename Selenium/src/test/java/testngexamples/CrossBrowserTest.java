package testngexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

	WebDriver driver;

	@Test
	@Parameters({ "BrowserName" })
	public void setup(String BrowserName)

	{

		if (BrowserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();

		}

		else if (BrowserName.equalsIgnoreCase("Chrome"))

		{
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/chromedriver.exe");
			 driver = new ChromeDriver();
		}

		else {
			System.setProperty("webdriver.edge.driver",
					"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/edgedriver.exe");
		 driver = new EdgeDriver();
		}

		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.close();

	}

}
