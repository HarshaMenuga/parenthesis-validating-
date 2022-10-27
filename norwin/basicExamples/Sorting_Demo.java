package exam;

import java.util.Arrays;

public class Sorting_Demo {

	public static void main(String[] args) {
		int temp =0;
	int array[]= {10,11,10,15,22,11};
	Arrays.sort(array);
	System.out.println(Arrays.toString(array));
	for(int i =0;i<array.length;i++) {
		for(int j =i+1;j<array.length;j++) {
			if(array[i]<array[j]) {
				temp = array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
	}
	System.out.println("Aescending Oreder");
	for(int i =0;i<array.length;i++) {
		System.out.print(array[i]+" ");
	}
	System.out.println("\nDscending  Oreder");
	for(int i =array.length-1;i>=0;i--) {
		System.out.print(array[i]+" ");
	}
	}

}
