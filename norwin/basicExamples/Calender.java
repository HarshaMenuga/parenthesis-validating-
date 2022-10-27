package exam;

import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month_code = 0,rem=0;
		System.out.println("Enter Date ::");
		int date = sc.nextInt();
		System.out.println("Enter Month ::");
		int month = sc.nextInt();
		System.out.println("Enter Year ::");
		String year = sc.next();
		int leapyear = Integer.parseInt(year);
		int leap_year = Integer.parseInt(year.substring(2));
		if (((leapyear % 4 == 0) && (leapyear % 100 != 0)) || (leapyear % 400 == 0)) {
			if(month==1) 
				month_code = 6;
			if(month==2) 
				month_code = 2;
			if(month==3 || month ==11) 
				month_code = 3;
			if(month==4 || month == 7) 
				month_code = 6;
			if(month==5) 
				month_code = 1;
			if(month==6) 
				month_code = 4;
			if(month==8) 
				month_code = 2;
			if(month==9 || month ==12) 
				month_code = 5;
			if(month == 10)
				month_code=0;
		}
		else {
			if(month==1 || month == 10) 
				month_code = 0;
			if(month==2||month==3 || month ==11) 
				month_code = 3;
			if(month==4 || month == 7) 
				month_code = 6;
			if(month==5) 
				month_code = 1;
			if(month==6) 
				month_code = 4;
			if(month==8) 
				month_code = 2;
			if(month==9 || month ==12) 
				month_code = 5;
		}
		int last_two_digits = leap_year/4;
		while(rem>7) {
			rem = (date+month_code+leap_year+last_two_digits)/7;
		}
		if(rem==0)
			System.out.println("It's Sunday Dude");
		if(rem==1)
			System.out.println("It's Monday Dude");
		if(rem==2)
			System.out.println("It's Tuesday Dude");
		if(rem==3)
			System.out.println("It's Wednesday Dude");
		if(rem==4)
			System.out.println("It's Thurshday Dude");
		if(rem==5)
			System.out.println("It's Friday Dude");
		if(rem==6)
			System.out.println("It's Saturday Dude");
		
	}

}
