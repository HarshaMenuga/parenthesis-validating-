package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class StringDateConvertToDate {

	public static void main(String[] args) throws ParseException {
		String str = "2022-10-20 19:36:44";
		
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		Date date = simpleFormat.parse(str);
		System.out.println("String TO UtilDate --> "+date);
		
		java.util.Calendar calender = Calendar.getInstance();
		calender.setTime(simpleFormat.parse(str));
		System.out.println("String to Calendar Date -->"+calender.getTime());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.parse(str, formatter);

		System.out.println("String to LocalDateTime --> "+dateTime);

	
		
	}

}
