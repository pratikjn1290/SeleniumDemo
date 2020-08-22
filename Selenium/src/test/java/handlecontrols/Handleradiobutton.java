package handlecontrols;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handleradiobutton {

	@Test
	public void radio() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pratik\\Desktop\\RestAssured\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement radio1 = driver.findElement(By.xpath("//input[@id = 'vfb-7-1']"));
		WebElement radio2 = driver.findElement(By.xpath("//input[@id = 'vfb-7-2']"));
		WebElement radio3 = driver.findElement(By.xpath("//input[@id = 'vfb-7-3']"));

		if (!radio1.isSelected()) {
			radio1.click();
			boolean flag = radio1.isEnabled();
			System.out.println("Radio one is selected:" + flag);

		}

		else if (!radio2.isSelected()) {
			radio2.click();
			boolean flag = radio2.isEnabled();
			System.out.println("Radio two is selected:" + flag);
		}

		else {
			radio3.click();
			boolean flag = radio3.isEnabled();
			System.out.println("Radio 3 is selected: " + flag);
		}

		driver.close();

	}

}