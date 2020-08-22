package fileuploadanddownload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ProgressBar {

	@Test
	public void ProgressRecord() {

		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Pratik/Desktop/RestAssured/Selenium/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/ProgressBar.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		WebElement Download = driver.findElement(By.xpath("//button[@id = 'cricle-btn']"));
		
		Download.click();

		WebElement progressbar = driver.findElement(By.xpath("//div[@class = 'progressbar-text']"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.textToBePresentInElement(progressbar, "100"));

		String result = progressbar.getText();

		System.out.println("Download Completed:" + result);

		driver.close();
	}

}
