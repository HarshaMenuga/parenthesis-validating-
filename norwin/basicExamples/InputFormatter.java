package exam;

import java.io.ObjectInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputFormatter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter String ::");
	
		
		if (sc.hasNextInt()) {
            System.out.println("This input is of type Integer.");
        }else if(sc.hasNextBoolean()) {
        	System.out.println("Boolean");
        }
        else if(sc.hasNextFloat()) {
        	System.out.println("Float");
        }else if(sc.hasNextDouble()) {
        	System.out.println("Double");
        }else if(sc.hasNextLine()) {
        	System.out.println("String");
        }
		
	}

}
