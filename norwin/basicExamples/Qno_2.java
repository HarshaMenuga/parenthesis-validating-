package exam;

public class Qno_2 {
	  public static void main(String[] args) {

	    int[] numbers = {4, 10, 6, 14, 2, 1, 8, 5};

	    mergeSort(numbers); 

	    System.out.println("Sorted array:");
	    for (int i = 0; i < numbers.length; i++) {
	      System.out.print(numbers[i]+" ");
	    }
	  }


	  private static void mergeSort(int[] inputArray) {
	    int arrayLength = inputArray.length;
	    
	    if (arrayLength < 2) {
	      return;
	    }
	    
	    int midPoint = arrayLength / 2;
	    int[] leftArray = new int[midPoint];
	    int[] rightArray = new int[arrayLength - midPoint];
	    
	    for (int i = 0; i < midPoint; i++) {
	      leftArray[i] = inputArray[i];
	    }
	    for (int i = midPoint; i < arrayLength; i++) {
	      rightArray[i - midPoint] = inputArray[i];
	    }
	    
	    mergeSort(leftArray);
	    mergeSort(rightArray);
	    
	    merge(inputArray, leftArray, rightArray);
	  }

	  private static void merge (int[] inputArray, int[] leftArray, int[] rightArray) {
	    int leftArrayLength = leftArray.length;
	    int rightArrayLength = rightArray.length;
	    
	    int x = 0;
	    int y = 0;
	    int z = 0;
	    
	    while (x < leftArrayLength && y < rightArrayLength) {
	      if (leftArray[x] <= rightArray[y]) {
	        inputArray[z] = leftArray[x];
	        x++;
	      }
	      else {
	        inputArray[z] = rightArray[y];
	        y++;
	      }
	      z++;
	    }
	    
	    while (x < leftArrayLength) {
	      inputArray[z] = leftArray[x];
	      x++;
	      z++;
	    }
	    
	    while (y < rightArrayLength) {
	      inputArray[z] = rightArray[y];
	      y++;
	      z++;
	    }
	    
	  }
	}