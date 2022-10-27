package com.java.demo.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;

public class JsonDemo {

	public static void main(String[] args) throws IOException, JSONException {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Ford");
		map.put(2, "Benz");
		map.put(3, "Skoda");
		map.put(4, "Mustang");
		map.put(5, "Lexus");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		ArrayList<Map.Entry<Integer, String>> list = new ArrayList<Entry<Integer, String>>(entrySet);
		System.out.println(list);		
		JSONArray object = new JSONArray(list);
		System.out.print(object);
		
	}
}
