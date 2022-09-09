package seraching;

public class Binary_Recursion {
	
	
	public static void main(String[] args) {
		int array[]= {1,2,3,4,5};
		int value = 90;
		int low = 0;
		int high = array.length; 
		search(array, value, low, high);
	}

	public static int search(int array[], int value, int low, int high) {
		int mid = (low + high) / 2;
		if (!(low <= high)||mid>=array.length) {
			System.out.println("not exists");
			return -1;
		}
		if (array[mid] == value) {
			System.out.println("Element exists in " + mid);
			return 1;
		}
		if (array[mid] < value) {
			low = mid + 1;
		} else {
			high = mid - 1;
		}
		return search(array, value, low, high);
	}

}