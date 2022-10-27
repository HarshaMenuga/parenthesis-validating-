package exam;

import java.util.Scanner;

public class InputFormat {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ::");
		String str = sc.next();
		if(str.matches("[+-]?[0-9]+")) {
			System.out.println("you entered an integer");
			
		}else if (str.matches("[-+]?[0-9]*\\.?[0-9]*")) {
			
			System.out.println("you entered a float");
		}
		else if(str.matches("[a-z,A-Z]")) {
			System.out.println("you entered a charcter");
		}
		else if(str.matches("[a-z,A-Z]+")) {
			System.out.println("you entered a String");
		}else if(str.matches("[!,@,#,$,&,*]+")) {
			System.out.println("you entered a Special Char");
			
		}else if(str.matches("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?")) {
			
			System.out.println("you entered double");
		}else if(str.matches("[+-]?[0-9]^[0-9]")) {
			System.out.println("you entered long");
		}

	}

}
