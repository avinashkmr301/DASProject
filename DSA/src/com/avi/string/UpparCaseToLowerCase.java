package com.avi.string;

public class UpparCaseToLowerCase {
	public static void main(String[] args) {
		/* a -> 97, A -> 65
		 UpperCase = LowerCase-32;
		 LowerCase = UpperCase+32;
		 This code will solve with space
		*/
		
		String s = "AVINASH KUMAR THAKUR";
		
		char[] c = s.toCharArray();
		int size = c.length;
		
		int i=0;
		while (i !=size) {
			if (c[i] !=' ') {
				c[i] = (char)(c[i]+32);
			}
			++i;
		}
		System.out.println(c);
	}

}
