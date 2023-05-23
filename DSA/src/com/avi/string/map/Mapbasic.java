package com.avi.string.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapbasic {
	public static void main(String[] args) {
		Map<String, Integer> map =new HashMap<>();
		map.put("Avinash", 100);
		map.put("Dilip", 200);
		map.put("Kala", 300);
		map.put("Jayant", 400);
		map.put("Prabal", 500);
		
		//System.out.println(map);
		Set<Map.Entry<String, Integer>> data=map.entrySet();
		for (Map.Entry<String, Integer> entry : data) {
			System.out.print(entry.getKey()+" ");
			System.out.println(entry.getValue());
		}
	}

}
