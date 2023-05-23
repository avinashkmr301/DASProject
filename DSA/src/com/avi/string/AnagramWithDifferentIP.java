package com.avi.string;

import java.util.Arrays;

public class AnagramWithDifferentIP {
	public static void main(String[] args) {
		String s1 = "Is it Good";
		String s2 = "IT iS GOOd";
		
		anagram(s1,s2);
	}
	//same word different arrangement with space and mix letter
	 static void anagram(String s1, String s2) {
		s1 = s1.replace(" ", "");
		s2 = s2.replace(" ", "");
		
		s1= s1.toLowerCase();
		s2= s2.toLowerCase();
		
		char[] x = s1.toCharArray();
		char[] y = s2.toCharArray();
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		boolean result = Arrays.equals(x, y);
		if (result == true) {
			System.out.println("It is Anagram");
		}else {
			System.out.println("Not Anagram");
		}
		
	}
	

}
