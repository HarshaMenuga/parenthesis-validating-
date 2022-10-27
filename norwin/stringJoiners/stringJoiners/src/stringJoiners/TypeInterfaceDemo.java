package stringJoiners;

import java.util.ArrayList;
import java.util.List;

public class TypeInterfaceDemo {
	public static void showListInteger(List<Integer> list) {
		if (list.isEmpty()) {
			System.out.println("list is Empty");
			
		} else {
			list.forEach(System.out::println);
		}
	}
	public static void showListString(List<String> list) {
		if (list.isEmpty()) {
			System.out.println("list is Empty");
			
		} else {
			list.forEach(System.out::println);
		}
	}
	public static void main(String[] args) {
		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(5);
		list2.add(7);
		showListInteger(list2);
		List<String> str = new ArrayList<>();
		str.add("Harsha");
		str.add("Vardhan");
		str.add("Ovaledge");
		showListString(str);
		showListInteger(new ArrayList<Integer>());
	}
}
