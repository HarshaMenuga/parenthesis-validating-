package exam;


import java.util.Scanner;

public class Rev_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ::");
		String str = sc.nextLine();
		String str_3 = "";
		char ch[] = str.toCharArray();
		int length = str.length();
		System.out.print("Reverse of the String ::");
		for (int i = ch.length-1; i >=0 ; i--) {
			str_3 += ch[i];
		}
		System.out.println(str_3);
		System.out.println();
		StringBuffer sbr = new StringBuffer(str);
		System.out.println("Reverse of the String using StringBuffer ::" + sbr.reverse());
		String[] str_2 = str.split(str);
		for (int i = 0; i < str_2.length; i++) {
			System.out.print(str_2[i]);
		}
	}

}
