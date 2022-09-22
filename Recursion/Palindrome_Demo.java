package recursion;

import java.util.Scanner;

public class Palindrome_Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value : ");
		String str = sc.next();
		if(palindrome(str))
			System.out.println("palindrome");
		else
			System.out.println("Not a palindrome");
	}

	private static boolean palindrome(String str) {
		if (str.length() == 0 || str.length() == 1) {
			return true;
		}
		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			return palindrome(str.substring(1,str.length()-1));
		}
		return false;
	}
}