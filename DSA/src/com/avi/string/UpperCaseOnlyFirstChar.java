package com.avi.string;

public class UpperCaseOnlyFirstChar {
	public static void main(String[] args) {
		/* a -> 97, A -> 65
		 UpperCase = LowerCase-32;
		 LowerCase = UpperCase+32;
		 This code will solve with space
		*/
		
		String s = "avinash kumar thakur";
		
		char[] c = s.toCharArray();
		int size = c.length;
		//first letter converted to upper case
		c[0] = (char)(c[0]-32);
		
		int i=0;
		while (i !=size) {
			if(c[i] == ' ') {
				c[i+1] = (char)(c[i+1]-32); // converting first letter to upper case after finding space
			}
			++i;
		}
		System.out.println(c);
	}
}
