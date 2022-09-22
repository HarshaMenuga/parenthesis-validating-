package recursion;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		System.out.println("Reverse of the String is : "+reverseString(str));
	}
	public static String reverseString(String str) {
		if(str.isEmpty()) {
			return str;
		}
		return reverseString(str.substring(1))+str.charAt(0);
		
	}
}
