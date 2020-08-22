package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DropdownWithSearch {
	@Test
	public void searchandselect() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Pratik/Desktop/RestAssured/Selenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement element = driver
				.findElement(By.xpath("//span[@role = 'combobox'][@aria-labelledby = 'select2-country-container']"));
		element.click();
		WebElement search = driver.findElement(By.xpath("//input[@type = 'search']"));
		search.sendKeys("Australia");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElements(search));
		Actions action = new Actions(driver);
		action.moveToElement(search).click().build().perform();

		element.clear();

		driver.close();
	}

}
