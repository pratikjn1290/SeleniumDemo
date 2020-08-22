package browserfactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Chromeoptions {

	@Test
	public void setupchrome() {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Pratik\\Desktop\\RestAssured\\Selenium\\Drivers\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disabled-extension");
			option.addArguments("--enable-javascript");
			option.addArguments("--disable-notification");
			WebDriver driver = new ChromeDriver(option);
			driver.get("https://google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			System.out.println(driver.getTitle());
			driver.close();

	}

}
