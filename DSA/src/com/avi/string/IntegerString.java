package com.avi.string;

public class IntegerString {
	public static void main(String[] args) {
		
		String string  = "1234";
		integerStringOrNot(string);
	}
	
	static void integerStringOrNot(String s) {
		int size = s.length();
		
		int i=0;
		while (i !=size) {
			if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				++i;
			}
			else {
				System.out.println("Not contained integer..");
				System.exit(0);
			}
		}
		System.out.println("Contains Integer only!");
		
	}

}
