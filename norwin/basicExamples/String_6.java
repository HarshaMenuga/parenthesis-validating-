package exam;

import java.util.Scanner;

public class String_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ::");
		String str = sc.nextLine();
		String str_2 = str.split("[0-9]")[0];
//		for(int i =0;i<str_2.length;i++) {
//			System.out.println(str_2[i]);
//		}
		System.out.println(str_2);
	}

}
