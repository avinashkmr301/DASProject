package com.avi.string;

public class Palindrom {
	public static void main(String[] args) {
		String string = "AM";
		
		char[] c = string.toCharArray();
		int size = c.length;
		
		char[] p = new char[size];
		
		int i=0;
		while (i !=size) {
			p[size-1-i]= c[i];
			++i;
		}
		//System.out.println(p);
		
		i=0;
		while (i !=size)
		{
			if (c[i]!=p[i]) {
				System.out.println("Not palindrom..");
				System.exit(0);
			}
			else {
				++i;
				continue;
			}
		}
		System.out.println("This is palindrom!");
		 
	}
}
