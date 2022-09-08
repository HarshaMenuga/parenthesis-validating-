package sort;

public class Binary_Search {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 9, 45, 78, 90, 345, 500 };
		int value = 5;
		int low = 0, high = arr.length - 1; // high=7
		int mid = 0;
		boolean iselementfound = false;
		while (low <= high) {
			mid = (low + high) / 2;
			// if (mid < arr.length - 1) {
			if (arr[mid] == value) {
				System.out.println("Element Exists in index : " + mid);
				 iselementfound = true;
				 break;
				
			} else if (value > arr[mid]) {
				low = mid + 1; // low = 3+1 --> low=4
//				System.out.println("low :"+ low);
//				System.out.println("Exists " + mid);
//				System.out.println("low : " + low + " high : " + high);

			} else {
				high = mid - 1; // high = 3-1 --> high=2
//				System.out.println("Element exists" + mid);
//				System.out.println("low : " + low + " high : " + high);
			}
		}
		if (!iselementfound) {
			System.out.println("Not exists");
		}
	}
}
