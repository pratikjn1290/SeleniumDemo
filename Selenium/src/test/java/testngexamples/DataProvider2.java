package testngexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {

	@Test(dataProvider = "testdata")
	public void login_data(String uname, String Pword) {

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
		pasword.sendKeys(Pword);
		WebElement terms = driver.findElement(By.xpath("//input[@name = 'isAgreedTerms']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", terms);

		WebElement signin = driver.findElement(By.xpath("//button[text()= ' Sign In ']"));
		signin.click();

		driver.close();
	}

	@DataProvider(name = "testdata")
	public Object[][] TestData()

	{

		Object[][] TestData = new Object[2][2];
		TestData[0][0] = "pratik.jain@corpository.com";
		TestData[0][1] = "*Corpository123";
		TestData[1][0] = "priyal.kansara@corpository.com";
		TestData[1][1] = "#Corpository.com";
		return TestData;

	}

}
