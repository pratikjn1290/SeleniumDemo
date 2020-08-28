package excelDataReader;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelFileReader {

	@Test
	public void excelread() throws Exception {

		File file = new File("C:\\Users\\Pratik\\git\\SeleniumDemo\\Selenium\\ExcelData\\UserData.xlsx");
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);

		int rowcount = sh.getLastRowNum() - sh.getFirstRowNum();

		for (int i = 0; i <= rowcount; i++) {

			Row row = sh.getRow(i);

			for (int j = 0; j < row.getLastCellNum(); j++) {

				System.out.println(row.getCell(j).getStringCellValue());

			}

		}

		wb.close();

	}
}
