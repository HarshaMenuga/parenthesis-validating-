package sort;

class Linear{
	int arr[] = {1,2,3,4,5};
	
}

public class Linear_Search {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int n =50;
		boolean iselementtfound=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println("Exists in "+i);
				iselementtfound=true;
			}
		}
		if(!iselementtfound) {
			System.out.println("Not exists");
		}
	}

}
