package windowandframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleFrames {
	@Test
	public void multiple_frame() {

		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");

		WebElement singleframe = driver.findElement(By.xpath("//a[@class  = 'analystic']"));
		singleframe.click();

		driver.switchTo().frame("singleframe");
		WebElement textbox = driver.findElement(By.xpath("//input[@type = 'text']"));
		textbox.sendKeys("In Single Frame");

		driver.switchTo().defaultContent();

		driver.close();
	}
}
