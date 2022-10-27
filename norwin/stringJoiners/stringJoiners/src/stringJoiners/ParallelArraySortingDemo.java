package stringJoiners;

import java.util.Arrays;

public class ParallelArraySortingDemo {

	public static void main(String[] args) {
		int array[]= {1,6,3,9,4,-1,-3,5,67};
		System.out.println("Printing Values :: ");
		for(int i: array) {
			System.out.print(i+" ");
		}
//		System.out.println();
//		Arrays.parallelSort(array);
//		for(int i: array) {
//			System.out.print(i+" ");
//		}
		Arrays.parallelSort(array, 0, 4);
		System.out.println("\nAfter Sorting :: ");
		for(int i : array) {
			System.out.print(i+" ");
		}
	}

}
