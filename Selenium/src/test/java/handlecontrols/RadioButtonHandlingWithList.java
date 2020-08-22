package handlecontrols;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonHandlingWithList {

	@Test
	public void radiobutton() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pratik\\Desktop\\RestAssured\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<WebElement> element = driver.findElements(By.xpath("//input[@type = 'radio']"));
		for (WebElement elem : element) {
			elem.click();
			System.out.println("Already Enabled" + elem.isEnabled());
		}
		driver.close();
	}
}