package exam;

import java.util.Scanner;

//public class Qno_3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number : ");
//		int n = sc.nextInt();
//		for(int i =1;i<=n;i++) {
//			for(int k =n;k>=i;k--) {
//				System.out.print(" ");
//			}
//			for(int j =1;j<=i;j++) {
//				if(j==1||j==i)
//					System.out.print(1+" ");
//				else {
//					int m =(i-j)*j;
//					System.out.print(m+" ");
//				}
//			}
//			System.out.println();
//		}
//	}
//}
import java.io.*;

class Qno_3 {
    public int factorial(int i)
    {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter number ");
    	int n = sc.nextInt();
        int i, j;
        Qno_3 g = new Qno_3();
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
 
                // for left spacing
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
 
                // nCr formula
                System.out.print(
                    " "
                    + g.factorial(i)
                          / (g.factorial(i - j)
                             * g.factorial(j)));
            }
 
            // for newline
            System.out.println();
        }
    }
}