package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WaitCommands {

	@Test
	public void wait_command() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://corpository.com");
		driver.manage().window().maximize();

		// This will wait for page to load, Time it will wait
		// - values accepted will wait for indefinite time.
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text() = 'Sign In']")).click();

		driver.wait();

		driver.wait(30000);

		// Will wait if any script is not loaded till 30 seconds
		// Negative value means script will run for indefinite time
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

		// This is hard wait wether element is found or not in dom it will wait till 30
		// seconds
		Thread.sleep(30000);

		driver.manage().window().wait();
		driver.manage().window().wait(30000);

		driver.close();
	}

}
