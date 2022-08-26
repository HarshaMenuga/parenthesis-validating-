// Complex Map using list

package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Complex_Map {

	public static void main(String[] args) {
		Map <Integer,String> map = new HashMap<Integer,String>();
		map.put(5, "Harsha");
		map.put(2, "Vardhan");
		map.put(3, "Meenuga");
		map.put(4, "OvalEdge");
		map.put(1, "ram");
		map.put(9, "Infosys");
		map.put(8, "TCS");
		map.put(7, "Google");
		map.put(6, "Meta");
		List<Integer> l1 = null;
		List<String> l2 = null;
		l1 = map.keySet().stream().collect(Collectors.toCollection(ArrayList::new));
		l2 = map.values().stream().collect(Collectors.toCollection(ArrayList::new));
	    System.out.println("Keys :"+l1);
	    System.out.println("Vlaues :"+l2);
		
	}

}
