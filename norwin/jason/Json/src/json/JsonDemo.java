package json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonDemo {

	public static void main(String[] args) throws IOException {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Ford");
		map.put(2, "Benz");
		map.put(3, "Skoda");
		map.put(4, "Mustang");
		map.put(5, "Lexus");
		
		JSONObject obj = new JSONObject();
		obj.put("id", 1);
		obj.put("name", "Harsha");
		
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		List<Map.Entry<Integer, String>> list = new ArrayList<Entry<Integer, String>>(entrySet);
		System.out.println(list);
		FileWriter file = new FileWriter("jsonfolder//test.json",false);
		file.write(obj.toJSONString());
		file.close();
		System.out.println("file has been created");
		
	}

}
