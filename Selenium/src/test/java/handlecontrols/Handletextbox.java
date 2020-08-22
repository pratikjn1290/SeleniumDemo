package handlecontrols;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handletextbox {

	@Test
	public void textbox() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Pratik/Desktop/RestAssured/Selenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement usermessage = driver.findElement(By.xpath("//input[@id = 'user-message']"));
		usermessage.sendKeys("Hello I am Pratik Jain");

		WebElement show_message = driver.findElement(By.xpath("//button[text() = 'Show Message']"));
		show_message.click();

		WebElement your_message = driver.findElement(By.xpath("//label[text() = 'Your Message: ']"));
		String user = your_message.getText();
		System.out.println(user);

		if (user.equalsIgnoreCase("Hello I am Pratik Jain")) {
			System.out.println("Matched");
		}

		else {
			System.out.println("Not Matched");
		}

		driver.close();
	}

}
