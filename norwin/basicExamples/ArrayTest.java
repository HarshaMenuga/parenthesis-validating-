package exam;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int arr[] = { 10,11,10,15,22,11};
		Arrays.sort(arr);
		int temp[]=new int[arr.length];
//		System.out.print(Arrays.toString(arr));
		int j = 0;
		int lastIndex = arr.length - 1;

		for (int i = 0; i < lastIndex; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}

		if (temp[j] != arr[lastIndex])
			temp[j++] = arr[lastIndex];
		for(int i =0;i<temp.length;i++) {
			System.out.print(temp[i]+" ");
		}
	}
}