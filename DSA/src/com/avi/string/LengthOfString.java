package com.avi.string;


public class LengthOfString {
	public static void main(String[] args) {
		String s = "avinash thakur";
		
		//System.out.println(s.length());
		
		//without using .length() method
		
		s = s.concat("\0");
		char[ ] c = s.toCharArray();
		
		int count = 0;
		int i =0;
		while (c[i] !='\0') {
			count++;
			i++;
		}
		System.out.println(count);
	}
		
}
