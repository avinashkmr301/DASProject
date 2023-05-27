package com.avi.string.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringContainsUniqueCharacter {
	public static void main(String[] args) {
		String s = "SPIDERMAN"; 
		char[] c = s.toCharArray();
		int size = c.length;
		
		Map<Character, Integer> map = new HashMap<>();
		
		int i=0;
		while(i !=size) {
			if(map.containsKey(c[i])==false) {
				map.put(c[i], 1);
			}else {
				int oldValue = map.get(c[i]);
				int newValue = oldValue+1;
				map.put(c[i], newValue);
			}
			++i;
		}
		Set<Map.Entry<Character, Integer>> hmap=map.entrySet();
		for(Map.Entry<Character, Integer> data:hmap) {
			
		}
	}

}
