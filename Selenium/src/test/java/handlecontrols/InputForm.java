package handlecontrols;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class InputForm {
	@Test
	public void submitform() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Pratik/Desktop/RestAssured/Selenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		WebElement FirstName = driver.findElement(By.xpath("//input[@name = 'first_name']"));
		FirstName.sendKeys("Pratik");

		WebElement LastName = driver.findElement(By.xpath("//input[@name = 'last_name']"));
		LastName.sendKeys("jain");

		WebElement Email = driver.findElement(By.xpath("//input[@name = 'email']"));
		Email.sendKeys("Pratik@gmail.com");

		WebElement Phone = driver.findElement(By.xpath("//input[@name = 'phone']"));
		Phone.sendKeys("43543543535");

		WebElement Address = driver.findElement(By.xpath("//input[@name = 'address']"));
		Address.sendKeys("22 Australia");

		WebElement city = driver.findElement(By.xpath("//input[@name = 'city']"));
		city.sendKeys("OHIO");

		WebElement State = driver.findElement(By.xpath("//select[@name = 'state']"));
		State.click();
		Select oselect = new Select(State);
		oselect.selectByIndex(3);

		WebElement Zip = driver.findElement(By.xpath("//input[@name = 'zip']"));
		Zip.sendKeys("345435");

		WebElement Website = driver.findElement(By.xpath("//input[@name = 'website']"));
		Website.sendKeys("https://myblog.com");

		WebElement Registered_Domain = driver.findElement(By.xpath("//input[@value = 'no']"));
		Registered_Domain.click();

		WebElement Project = driver.findElement(By.xpath("//textarea[@name = 'comment']"));
		Project.sendKeys("Hello My Project");

		WebElement Submit = driver.findElement(By.xpath("//button[@type = 'submit']"));
		Submit.click();
	}

}
