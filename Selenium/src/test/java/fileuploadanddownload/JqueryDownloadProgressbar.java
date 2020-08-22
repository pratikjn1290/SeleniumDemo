package fileuploadanddownload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JqueryDownloadProgressbar {

	
	
	@Test
	public void jqueryloader() {

		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Pratik/Desktop/RestAssured/Selenium/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/JqueryProgressBar.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		WebElement Download = driver.findElement(By.xpath("//button[@id = 'downloadButton']"));
		Download.click();
		
		WebElement progress = driver.findElement(By.xpath("//div[@class = 'progress-label']"));
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.textToBePresentInElement(progress, "Complete!"));
		
		String progresslevel = progress.getText();
		
		System.out.println(progresslevel);
	
		driver.findElement(By.xpath("//button[text() = 'Close']")).click();
	
		driver.close();
	}
	
	
}
