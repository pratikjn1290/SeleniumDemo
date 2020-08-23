package windowandframes;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultiplesSeperateWindow {
	@Test
	public void Multiplewindows() throws Exception

	{
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		WebElement Open_New_Seperate_Windows = driver.findElement(By.xpath("//a[@href = '#Multiple']"));
		Open_New_Seperate_Windows.click();

		String Parent = driver.getWindowHandle();
		System.out.println(Parent);

		WebElement btn_click = driver.findElement(By.xpath("//button[text() = 'click ']"));
		btn_click.click();

		Set<String> All_Window = driver.getWindowHandles();

		Iterator<String> I1 = All_Window.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!Parent.equalsIgnoreCase(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(Parent);
		String Parent_Title= driver.getTitle();
		System.out.println(Parent_Title);
		Thread.sleep(3000);
		driver.close();
	}

}
