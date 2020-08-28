package testngexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "testdata")
	public void user_login(String uname, String pword) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Pratik\\git\\SeleniumDemo\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://corpository.com/home/authentication/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

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
	}

	@DataProvider(name = "testdata")
	public Object[][] TestDataFeed() {
		Object[][] user_data = new Object[2][2];

		user_data[0][0] = "pratik.jain@corpository.com";
		user_data[0][1] = "#Corpository123";
		user_data[1][0] = "bharti.paryani@corpository.com";
		user_data[1][1] = "priyal.kansara@corpository.com";
		return user_data;

	}
}
