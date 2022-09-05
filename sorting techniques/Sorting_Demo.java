package sort;

import java.util.Random;
import java.util.Scanner;

public class Sorting_Demo {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length: ");
		int n = sc.nextInt();
		
		int array[] = new int[n];
		for (int i=0;i<array.length;i++) {
			array[i]=rand.nextInt(1000);
		}
		System.out.println("Before Array: ");
		printArray(array);
		System.out.println("\nAfter Array: ");		
		// Bubble Sort Algorithm
		
		boolean swap = true;
		while(swap) {
			swap= false;
		for(int i=0;i<array.length-1;i++) {
				if(array[i]>array[i+1]) {
					swap = true;
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
				
			}
		}
		System.out.println("After Array :");
		printArray(array);
	}
		
	private static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}