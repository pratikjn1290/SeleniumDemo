package alerthandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class draganddrop {

	@Test
	public void dragdrop() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Pratik/Desktop/RestAssured/Selenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement source = driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath(".//*[@id = 'droppable']"));

		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		System.out.println("Element has been drag and dropped");
		
		driver.close();
	}

}
