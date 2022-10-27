package exam;

import java.util.Scanner;

public class Array_Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter numbers :");
		for (int i = 0; i <= array.length - 1; i++) {
			array[i] = sc.nextInt();
		}
//		int mid = array.length/2;
//		int pos[] = new int[mid];
//		int neg[] = new int[array.length-mid];
		int mid = array.length/2;
		int pos[]= {};
		int neg[] = {};
		int k =0;
		int j=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				neg[k] = array[i];
				k++;
			} else {
				pos[j] = array[i];
				j++;
			}
		}
		System.out.print("negative Array: ");
		for (int i = 0; i < neg.length; i++) {
			System.out.print(neg[i]+" ");
		}
		System.out.print("\nPositive Array : ");
		for (int i = 0; i < pos.length; i++) {
			System.out.print(pos[i]+" ");
		}
		int m =0,p=0,s=0;
		int temp_Array[]=new int[array.length];
		for(int i =0;i<temp_Array.length;i++) {
		}
	}

}
