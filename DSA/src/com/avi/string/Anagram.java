package com.avi.string;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		String s = "GAURVI";
		String ss = "RVIAUG";
		anagram(s, ss);
	}
	// Anagram: words are same but in different arrangement
	 static void anagram(String s, String ss) {
		
		 char[] x = s.toCharArray();
		 char[] y = ss.toCharArray();
		 
		 Arrays.sort(x);
		 Arrays.sort(y);
		 
		boolean result= Arrays.equals(x, y);
		if (result == true) {
			System.out.println("It is Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}

}
