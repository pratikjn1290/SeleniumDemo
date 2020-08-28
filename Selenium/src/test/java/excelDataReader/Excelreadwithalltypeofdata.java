package excelDataReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.maven.surefire.shared.io.FilenameUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

class Excelreadwithalltypeofdata {

	@Test
	public void excelread() throws IOException

	{

		File file = new File("C:/Users/Pratik/git/SeleniumDemo/Selenium/ExcelData/UserData.xlsx");
		String filename = FilenameUtils
				.getExtension("C:/Users/Pratik/git/SeleniumDemo/Selenium/ExcelData/UserData.xlsx");
		FileInputStream fis = new FileInputStream(file);

		Workbook wb = null;

		if (filename.equalsIgnoreCase("xlsx")) {
			wb = new XSSFWorkbook(fis);

		}

		else {
			wb = new HSSFWorkbook(fis);

		}

		Sheet sh = wb.getSheet("Sheet1");

		int rowno = sh.getLastRowNum() - sh.getFirstRowNum();

		for (int i = 0; i <= rowno; i++) {

			Row row = sh.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {

				System.out.println(row.getCell(j).getStringCellValue());

			}

		}
		wb.close();
	}

}