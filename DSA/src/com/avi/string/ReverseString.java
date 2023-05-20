package com.avi.string;

public class ReverseString {
	
	public static void main(String[] args) {
		String s = "Laptop";
		
		char[] c = s.toCharArray();
		int size = c.length;
		
		char[] reverse = new char[size];
		
		int i=0;
		while (i !=size) {
			reverse[size-1-i] = c[i];
			++i;
		}
		System.out.println(reverse);
	}

}
