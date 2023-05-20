package com.avi.string;

public class LowerCaseToUpperCase {
	
	public static void main(String[] args) {
		/* a -> 97, A -> 65
		 UpperCase = LowerCase-32;
		 LowerCase = UpperCase+32;
		 This code will solve without space
		*/
		String s = "avinashthakur";
		System.out.println("existing: "+ s);
		//Directly we can't manipulate String character So Need to convert to charArray.
		char[] c = s.toCharArray();
		int size = c.length;
		
		int i=0;
		while (i !=size) {
			c[i]=(char)(c[i]-32);
			++i;
		}
		System.out.println(c);
	}

}
