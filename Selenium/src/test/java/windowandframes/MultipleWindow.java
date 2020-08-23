package windowandframes;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleWindow {
	@Test
	public void multiple_window() {
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

		String Parent = driver.getWindowHandle();
		System.out.println(Parent);

		WebElement click = driver.findElement(By.xpath("//button[text() = '    click   ']"));
		click.click();

		Set<String> allwindow = driver.getWindowHandles();
		Iterator<String> I1 = allwindow.iterator();

		while (I1.hasNext()) {
			String child_window = I1.next();
			{
				if (!Parent.equalsIgnoreCase(child_window)) {
					driver.switchTo().window(child_window);

					System.out.println(driver.switchTo().window(child_window).getTitle());

					driver.close();
				}

				driver.switchTo().window(Parent);

			}
		}
	}

}
