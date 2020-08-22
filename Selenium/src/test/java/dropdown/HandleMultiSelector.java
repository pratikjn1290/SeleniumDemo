package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleMultiSelector {

	@Test
	public void multiselect() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Pratik/Desktop/RestAssured/Selenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement element = driver.findElement(By.cssSelector("#multi-select"));
		Select oselect = new Select(element);
		oselect.selectByVisibleText("Florida");
		oselect.selectByValue("Ohio");

		Thread.sleep(3000);

		driver.close();

	}

}
