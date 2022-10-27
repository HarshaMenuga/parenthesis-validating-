package stringJoiners;

import java.util.StringJoiner;

public class StringjoinersDemo {

	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(":","[", "]");
		joiner.setEmptyValue("Empty");
		System.out.println(joiner); 
		joiner.add("harsha");
		
		joiner.add("Welcome");
		joiner.add("ovaledge");
		System.out.println(joiner);
		System.out.println(joiner.length());
		String str = joiner.toString();
		System.out.println(str);
		System.out.println(str.length());
		for(int i =0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
		
	}

}
