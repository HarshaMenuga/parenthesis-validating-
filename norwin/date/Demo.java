package date;


import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence :: ");
		String str = sc.nextLine();
		String newStr=str.replaceAll(","," ");
		System.out.println(newStr);
		Scanner obj = new Scanner(newStr);
		while(obj.hasNext()){
			System.out.print(obj.next());
		    if(obj.hasNext()){ 
		         System.out.print(","); 
		      } 
		}
	}

}
