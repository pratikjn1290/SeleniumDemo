package exceptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NoSuchElementFoundException {

	//This program generated no such element exception
	@Test
	public void nosuchelement() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pratik\\git\\SeleniumDemo\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.id("q"));

		driver.close();
	}

}
