package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
//DateDemo
public class Date_Demo {

	public static void main(String[] args) throws ParseException {
	Date date1 = new Date();
	System.out.println("Date"+date1);
	LocalDate date= LocalDate.now();
	System.out.println("Local Date ::"+date);
//	System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::YYYY")));
	Instant timestamp = Instant.now();
	System.out.println("Insatnt Time ::"+timestamp);
	LocalDateTime time = LocalDateTime.now();
	System.out.println("Formatted Date ::"+time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
	LocalDateTime dt = LocalDateTime.parse("11:Oct:2022 21:39:48",DateTimeFormatter.ofPattern("dd:MMM:uuuu HH:mm:ss"));
	System.out.println(dt);
	
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	String new_format = format.format(date1);
	Date cal = format.parse(new_format);
	System.out.println("Date"+cal);
	System.out.println("Simple Date Format ::"+new_format);
	}
}
