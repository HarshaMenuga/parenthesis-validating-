package exam;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Qno_6 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"C");
		map.put(2,"C++");
		map.put(3,"Pyhton");
		map.put(4,"MySql");
		map.put(5,"Java");		
		System.out.println(map);
		TreeMap<Integer,String> tree = new TreeMap<Integer,String>();
		tree.put(6, "Harsha");
		tree.putAll(map);
		System.out.println(tree);
		
		
	}

}
