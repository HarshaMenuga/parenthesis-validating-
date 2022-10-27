package exam;
import java.util.Scanner;
public class String_Compare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String_1 ::");
		String str = sc.nextLine();
		System.out.println("Enter String_2 ::");
		String str_2 = sc.nextLine();
		case_insensitivity(str,str_2);
		case_sensitive(str,str_2);
	}
	private static void case_insensitivity(String str, String str_2) {
		System.out.println(str.equalsIgnoreCase(str_2));
	}
	private static  void case_sensitive(String str, String str_2) {
		System.out.println(str.equals(str_2));
	}	
}
