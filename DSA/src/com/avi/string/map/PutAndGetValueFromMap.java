package com.avi.string.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PutAndGetValueFromMap {
	
	public static void main(String[] args) {
		String s = "avinash";
		char[] ch = s.toLowerCase().toCharArray();
		int size = ch.length;
		
		Map<Character, Integer> map = new HashMap<>();
		//put key and value in Map
		int i=0;
		while (i != size) {
			if(map.containsKey(ch[i])==false) {
				map.put(ch[i], 1);
			}else {
				int oldValue=map.get(ch[i]);
				int newValue = oldValue+1;
				map.put(ch[i], newValue);
			}
			++i;
		}
		// get key and value from Map
		Set<Map.Entry<Character, Integer>> hmap=map.entrySet();
		for (Map.Entry<Character, Integer> entry : hmap) {
			Character key=entry.getKey();
			Integer  value = entry.getValue();
			System.out.println(key+" "+value);
		}
	}

}
