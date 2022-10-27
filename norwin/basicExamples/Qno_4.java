package exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Qno_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		try {
			int n = sc.nextInt();
			if (n < 1) {
				System.out.println("Please enter positive values ");
			}
			for (int i = 1; i <= n; i++) {
				if (n % i == 0)
					System.out.println(i);
			}
		} catch (InputMismatchException e) {
			System.out.println("Please enter postive values only");
		}

	}

}
