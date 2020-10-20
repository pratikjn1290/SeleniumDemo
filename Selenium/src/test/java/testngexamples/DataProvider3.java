package testngexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider3 {

	@DataProvider(name = "Test_Data")
	public Object[][] test_data() {

		Object[][] data = new Object[2][2];
		
		for (int i = 0; i <= 1; i++) {
	
				
				data[i][0] = "pratik.jain@corpository.com";
				data[i][1] = "";
			}
	return data;

	}

	@Test(dataProvider = "Test_Data")
	public void test_login(String uname, String pword) {
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.corpository.com/home/authentication/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		WebElement username = driver.findElement(By.xpath("//input[@name = 'email']"));
		username.clear();
		username.sendKeys(uname);
		WebElement pasword = driver.findElement(By.xpath("//input[@name = 'password']"));
		pasword.clear();
		pasword.sendKeys(pword);
		WebElement terms = driver.findElement(By.xpath("//input[@name = 'isAgreedTerms']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", terms);

		WebElement signin = driver.findElement(By.xpath("//button[text()= ' Sign In ']"));
		signin.click();

		driver.close();
	}
}