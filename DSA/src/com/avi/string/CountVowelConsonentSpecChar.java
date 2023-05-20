package com.avi.string;

public class CountVowelConsonentSpecChar {
	public static void main(String[] args) {
		/*
		 * only for upper case, for space use .replace(" ","") & if lowerCAse use .toUpperCase()
		 */
		String string = "AVINASH KUMAR THAKUR";
		
		char[] c = string.toCharArray();
		int size = c.length;
		int vowel = 0;
		int consonent = 0;
		int spclChar = 0;
		
		
		int i=0;
		while (i !=size) {
			if(c[i]>='A' && c[i]<='z') {
				if (c[i]=='A'|| c[i]=='E'|| c[i]=='I'|| c[i]=='O'|| c[i]=='U') 
				{
					++vowel;
				}
				else {
					++consonent;
				}
			}
			else {
				++spclChar;
			}
			++i;
		}
		System.out.println(string);
		System.out.println(vowel);
		System.out.println(consonent);
		System.out.println(spclChar);
	}

}
