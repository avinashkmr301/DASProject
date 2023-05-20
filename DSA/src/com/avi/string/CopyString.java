package com.avi.string;

import java.util.Arrays;

public class CopyString {
	public static void main(String[] args) {
		String s = "avinash";
		
		char[] c = s.toCharArray();
		int size = c.length;
		
		char[] copy = new char[size];
		
		int i=0;
		while (i !=size) {
			copy[i] = c[i];
			i++;
		}
		System.out.println(s);
		System.out.println(copy);
		System.out.println("copy the string: "+Arrays.toString(copy));
		
	}

}
