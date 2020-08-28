package csvReader;

import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class CSVRead {

	@Test
	public void csv() throws Exception {

		CSVReader csvfile = new CSVReader(new FileReader("C:/Users/Pratik/git/SeleniumDemo/Selenium/CSV/Demo.csv"));

		List<String[]> alldata = csvfile.readAll();

		int size = alldata.size();
		System.out.println(size);

		Iterator<String[]> i1 = alldata.iterator();
		while (i1.hasNext()) {
			String[] data = i1.next();

			System.out.println("Values are");

			for (int i = 0; i < data.length; i++) {

				System.out.print(" " + data[i]);

			}
			System.out.println("   ");

		}

		csvfile.close();
	}

}
