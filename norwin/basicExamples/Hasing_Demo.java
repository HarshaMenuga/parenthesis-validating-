package exam;

import java.util.HashSet;

public class Hasing_Demo {

	public static void main(String[] args) {
		int array[]= {10,11,10,15,22,11};
		HashSet<Integer> hash =  new HashSet<Integer>();	
		for(int i = 0;i<array.length;i++) {
				hash.add(array[i]);
		}
		System.out.println(hash);
		}
	}
