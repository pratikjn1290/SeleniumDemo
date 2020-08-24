package windowandframes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class CurrentDateandTime {

	@Test
	public void getcurrentdate()

	{

		DateFormat df = new SimpleDateFormat("dd/mm/yyyy ");
		Date date = new Date();
		String Data = df.format(date);
		System.out.println(Data);

	}

	@Test
	public void getcurrenttimeanddate()

	{

		DateFormat df = new SimpleDateFormat("dd/mm/yyyy HH:mm ");
		Date date = new Date();
		String Data = df.format(date);
		System.out.println(Data);

	}

}
