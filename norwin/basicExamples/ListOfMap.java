package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ListOfMap {

	public static void main(String[] args) {
	List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
	
	Map<String,Object> map = new HashMap<String,Object>();
	map.put("hasrha",1); 
	map.put("Vardhan",2);
list.add(map);
for(int i =0;i<list.size();i++) {
	System.out.println(map.keySet());
	System.out.println(map.values());
}
	

	}

}
