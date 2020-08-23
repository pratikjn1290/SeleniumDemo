package windowandframes;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Seperatewindow {

	@Test
	public void Seprate_Window() {
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String Parent = driver.getWindowHandle();
		System.out.print(Parent);
		WebElement Open_New_Tabbed_Windows = driver.findElement(By.xpath("//a[@href = '#Seperate']"));
		Open_New_Tabbed_Windows.click();

		WebElement btn_Click = driver.findElement(By.xpath("//button[text() = 'click']"));
		btn_Click.click();

		// Iterating mutliple windows
		Set<String> AllWindow = driver.getWindowHandles();
		Iterator<String> I1 = AllWindow.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!Parent.equalsIgnoreCase(child_window)) {
				driver.switchTo().window(child_window);
				String Title = driver.getTitle();
				System.out.println(Title);
				driver.close();
			}

		}

		driver.switchTo().window(Parent);

	}

}
