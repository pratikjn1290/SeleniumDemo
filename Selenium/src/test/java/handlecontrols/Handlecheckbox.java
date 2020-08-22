package handlecontrols;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlecheckbox {

	@Test
	public void checkbox() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pratik\\Desktop\\RestAssured\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id = 'vfb-6-0']"));
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@id = 'vfb-6-1']"));
		WebElement checkbox3 = driver.findElement(By.xpath("//input[@id = 'vfb-6-2']"));

		if (!checkbox1.isSelected() && !checkbox2.isSelected() && !checkbox3.isSelected()) {
			checkbox1.click();
			checkbox2.click();
			checkbox3.click();
			boolean flag = checkbox1.isEnabled();
			boolean flag2 = checkbox1.isEnabled();
			boolean flag3 = checkbox1.isEnabled();
			System.out.println("checkbox one is selected: " + flag +flag2 +flag3);

		}

		driver.close();
	}
}