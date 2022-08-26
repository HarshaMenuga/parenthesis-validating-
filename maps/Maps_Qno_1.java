//1. Write a Java program to associate the specified value with the specified key in a HashMap.

package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps_Qno_1 {

	public static void main(String[] args) {
		Map<Integer,String> map1 = new HashMap<>();
		Map<Integer,String> map2 = new HashMap<>();
		
		map1.put(5, "Harsha");
		map1.put(2, "Vardhan");
		map1.put(3, "Meenuga");
		map1.put(4, "OvalEdge");
		map1.put(1, "ram");
		System.out.println("Values in first map :"+map1);
		
		map2.put(9, "Infosys");
		map2.put(8, "TCS");
		map2.put(7, "Google");
		map2.put(6, "Meta");
		System.out.println("Values in second map :"+map2);
		
		map2.putAll(map1); //3. Write a Java program to copy all of the mappings from the specified map to another map. 
		System.out.println("New Map: "+map2);
		Set<Integer> keys = map2.keySet();
		for(int key:keys) {
			System.out.println(key+" "+map2.get(key));
		}
		System.out.println("Number of keys :"+map2.size()); //2. Write a Java program to count the number of key-value (size) mappings in a map. 
		
		boolean bool = map2.isEmpty(); //  	5. Write a Java program to check whether a map contains key-value mappings (empty) or not. 
//		Object map3 =  ((HashMap<Integer, String>)map1).clone(); 
//		System.out.println(map3);
		Map<Integer,String> map3 = new HashMap<>(map2); // 6. Write a Java program to get a shallow copy of a HashMap instance. 
		map3.put(10, "sita");
		System.out.println(map3);
		
		
		}
	}

