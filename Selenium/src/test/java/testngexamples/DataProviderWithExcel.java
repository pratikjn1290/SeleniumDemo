package testngexamples;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithExcel {
	@Test(dataProvider = "test_data")
	public void dataprovide(String Uname, String Pword) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Pratik\\git\\SeleniumDemo\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.corpository.com/home/authentication/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//input[@name = 'email']"));
		username.clear();
		username.sendKeys(Uname);
		WebElement pasword = driver.findElement(By.xpath("//input[@name = 'password']"));
		pasword.clear();
		pasword.sendKeys(Pword);
		WebElement terms = driver.findElement(By.xpath("//input[@name = 'isAgreedTerms']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", terms);

		WebElement signin = driver.findElement(By.xpath("//button[text()= ' Sign In ']"));
		signin.click();

		driver.close();
	}

	@DataProvider(name = "test_data")
	public Object[][] testdata() throws IOException {

		Object[][] login_data = new Object[1][1];

		XSSFWorkbook wb = new XSSFWorkbook("C:\\Users\\Pratik\\git\\SeleniumDemo\\Selenium\\ExcelData\\UserData.xlsx");

		XSSFSheet sh = wb.getSheetAt(0);

		int rowno = sh.getLastRowNum() - sh.getLastRowNum();

		for (int i = 0; i <= rowno; i++) {

			Row row = sh.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {

				login_data[i][j] = row.getCell(j).getStringCellValue();

			}

		}
		return login_data;
	}

}
