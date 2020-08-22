package alerthandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderMethod1 {

	@Test
	public void normalslide() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Pratik/Desktop/RestAssured/Selenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Slider.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement source = driver.findElement(By.xpath("//a[@class = 'ui-slider-handle ui-state-default ui-corner-all']"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(source, 303, 300).build().perform();
		source.click();
		
		driver.close();
	}

}
