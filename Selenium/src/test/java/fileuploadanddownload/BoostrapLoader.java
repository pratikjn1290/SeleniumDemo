package fileuploadanddownload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BoostrapLoader {

	@Test
	public void loader() {

		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Pratik/Desktop/RestAssured/Selenium/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Loader.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		WebElement run = driver.findElement(By.xpath("//button[@id = 'loader']"));
		run.click();
		WebElement modal = driver.findElement(By.tagName("p"));

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(modal));

		String message = modal.getText();
		System.out.println("Message Copied: " + message);

		WebElement save = driver.findElement(By.xpath("//button[text() = 'Save changes']"));
		save.click();

		driver.close();

	}

}