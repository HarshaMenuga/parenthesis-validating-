package exam;

import java.util.Arrays;
import java.util.Scanner;

public class String_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String ::");
		String str = sc.next();
		System.out.println("Before remove duplicates ::"+str);
		char array[]=str.toCharArray();
		Arrays.sort(array);
//		System.out.println(Arrays.toString(array));
		int count=0;
		int length = array.length-1;
		String new_str ="";
		for(int i =0;i<length;i++) {
			if(array[i]!=array[i+1]) {
				new_str+=array[i];
				count++;
			}
		}
		if(length!=new_str.length()) {
			new_str+=array[length];
			count++;
		}
//		System.out.println(length);
		
		System.out.println("after remove duplicates :: "+new_str);
		System.out.println("Total count of characters ::"+count);
	}

}
