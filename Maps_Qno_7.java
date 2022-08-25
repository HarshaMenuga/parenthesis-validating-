package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Maps_Qno_7 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Map<Integer,String> map1 = new HashMap<>();
			
			
			map1.put(5, "Harsha");
			map1.put(2, "Vardhan");
			map1.put(3, "Meenuga");
			map1.put(4, "OvalEdge");
			map1.put(1, "ram");

			System.out.println("Values in first map :"+map1);
			System.out.println("Enter key :");
			int specific_key = sc.nextInt();
			if(map1.containsKey(specific_key)){
					System.out.println(map1.get(specific_key));
				}
				else
					System.out.println("wrong key");
			}
	}

