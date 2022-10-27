package date;



import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateFormatter {
	public static void main(String[] argv)  {
		java.util.Date Utildate = new Date();
		java.sql.Date sqlDate = new java.sql.Date(Utildate.getTime());
		System.out.println("util Date TO SQL Date --> "+sqlDate);
		
		java.util.Calendar utilCalendar = Calendar.getInstance();
		utilCalendar.setTime(Utildate);
		System.out.println("Util Date TO Calendar  -->"+utilCalendar.getTime());
		
		Utildate = utilCalendar.getTime();
		System.out.println("Calendar Date To Util Date  --> "+Utildate);
		
		sqlDate =  new java.sql.Date(utilCalendar.getTimeInMillis());
		System.out.println("Calendar Date to SqlDate --> "+sqlDate);
		
		Utildate = new  Date(sqlDate.getTime());
		System.out.println("Sql Date to Util Date --> "+Utildate);
		
		Calendar cal4 = Calendar.getInstance();
		cal4.setTime(sqlDate);
		System.out.println("SqlDate to Calnedar date --> "+cal4.getTime());
		
		LocalDateTime datetime = LocalDateTime.now();
	
		sqlDate = java.sql.Date.valueOf(datetime.toLocalDate());
		System.out.println("LocalDateTime to SqlDate -->"+sqlDate);
	
	}



}