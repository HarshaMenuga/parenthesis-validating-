package recursion;
import java.util.Scanner;

public class Sumofnumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		System.out.println("Sum of numbers are " + sumofnumbers(n));
	}
	private static int sumofnumbers(int n) {
		if (n <=0 ) {
			return n;
		}
		return n+sumofnumbers(n-1);
	}
}
