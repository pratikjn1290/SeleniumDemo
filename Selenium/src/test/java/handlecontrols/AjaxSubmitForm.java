package handlecontrols;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AjaxSubmitForm {

	@Test
	public void submitform() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Pratik/Desktop/RestAssured/Selenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		WebElement FirstName = driver.findElement(By.xpath("//input[@name = 'title']"));
		FirstName.sendKeys("Pratik");

		WebElement Comment = driver.findElement(By.xpath("//textarea[@id= 'description']"));
		Comment.sendKeys("Hello How Are You!");

		WebElement Submit = driver.findElement(By.xpath("//input[@id = 'btn-submit']"));
		Submit.click();

		WebElement successmessage = driver.findElement(By.xpath("//div[@id = 'submit-control']"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.textToBePresentInElement(successmessage, "Form submited Successfully!"));
		String success = successmessage.getText();
		System.out.println("Submitted Successfully : " + success);
		driver.close();
	}
}
