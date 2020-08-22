package fileuploadanddownload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadFile {

	@Test
	public void Download() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Pratik/Desktop/RestAssured/Selenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		WebElement Download = driver.findElement(By.xpath("//a[text() = 'Download']"));
		Download.click();

		// TextFileDownload

		WebElement Data = driver.findElement(By.xpath("//textarea[@id = 'textbox']"));
		Data.sendKeys("Hello All I have added Data");

		WebElement Generate = driver.findElement(By.xpath("//button[@id = 'createTxt']"));
		Generate.click();

		WebElement DownloadLink = driver.findElement(By.id("link-to-download"));
		DownloadLink.click();

		// PDFFileDownload

		WebElement PDFData = driver.findElement(By.xpath("//textarea[@id = 'pdfbox']"));
		PDFData.sendKeys("Hello All I have added Data to download pdf data");

		WebElement PDFGenerate = driver.findElement(By.xpath("//button[@id = 'createPdf']"));
		PDFGenerate.click();

		WebElement PDFDownloadLink = driver.findElement(By.id("pdf-link-to-download"));
		PDFDownloadLink.click();

		driver.close();

	}

}
