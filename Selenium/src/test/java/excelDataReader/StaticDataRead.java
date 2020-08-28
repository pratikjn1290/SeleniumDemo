package excelDataReader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class StaticDataRead {

	@Test
	public void dataread() throws InvalidFormatException, IOException {

		File file = new File("C:/Users/Pratik/git/SeleniumDemo/Selenium/ExcelData/UserData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);

		XSSFSheet sh = wb.getSheetAt(0);

		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sh.getRow(2).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(2).getCell(1).getStringCellValue());

		wb.close();
	}
}
