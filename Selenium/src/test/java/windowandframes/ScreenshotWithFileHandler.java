package windowandframes;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenshotWithFileHandler {

	@Test
	public void filehandle() throws WebDriverException, IOException

	{
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	File target =	new File("C:/Users/Pratik/git/SeleniumDemo/Selenium/Screnshots/error" +System.currentTimeMillis()+ ".png");
		TakesScreenshot ts=(TakesScreenshot)driver;
	FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), target);
	
	driver.close();

	}

}
