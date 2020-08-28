package testngexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExample {

	@Test(priority = 3)
	public void test1() {
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		String src = driver.getTitle();
		System.out.println("Here Is the Test1" + Thread.currentThread().getId() + src);
		driver.close();
	}

	@Test(priority = 1)
	public void test2() {

		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		String src = driver.getTitle();
		System.out.println("Here Is the Test2" + Thread.currentThread().getId() + src);
		driver.close();
	}

	@Test(priority = 2)
	public void test3() {

		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		String src = driver.getTitle();
		System.out.println("Here Is the Test3" + Thread.currentThread().getId() + src);
		driver.close();
	}

	@Test(priority = 4)
	public void test4() {

		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		String src = driver.getTitle();
		System.out.println("Here Is the Test4" + Thread.currentThread().getId() + src);
		driver.close();
	}

}
