package programs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormate {

	public static void main(String[] arg)throws Exception {
		/*Date currentDate = new Date();
		System.out.println("Current Date:" +currentDate);*/
		
		/*Locale lcl = Locale.getDefault();
		
		Date d = new Date();
		DateFormat dFormate = DateFormat.getDateInstance(DateFormat.SHORT,lcl);
		String str = dFormate.format(d);
		System.out.println(str);*/
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyy");
		System.out.println("The current date:" +sdf.format(d));
		

	}

}
