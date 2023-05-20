package com.avi.string;

public class PalindromWithSpace {
	public static void main(String[] args) {
		String string = "too hot TO HOOT";
		
		//remove space and make them in upperLatter/lowerLtter
		
		string = string.replace(" ", "");
		string = string.toLowerCase();
		
		char[] c = string.toCharArray();
		
		int size = c.length;
		char[] r = new char[size];
		
		int i=0;
		while (i !=size) {
			r[size-1-i] = c[i];
			++i;
		}
		System.out.println(r);
		
		i=0;
		while (i !=size) {
			if (c[i] != r[i]) {
				System.out.println("Not palindrom..");
				System.exit(0);
			}
			else {
				++i;
				continue;
			}
		}
		System.out.println("It is Palindrom!");
	}
}
