package seleniumAdvanceActivity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JQueryTooltip {

	@Test
	public void Mouse_Hover_JQuery()

	{
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/tooltip.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		WebElement Download = driver.findElement(By.xpath("//a[@id = 'download_now']"));

		Actions act = new Actions(driver);
		act.clickAndHold(Download).build().perform();

		WebElement Tooltip = driver.findElement(By.linkText("What's new in 3.2"));
		act.moveToElement(Tooltip).build().perform();
		
		String msg = Tooltip.getText();

		System.out.println(msg);

		driver.close();
	}

}
