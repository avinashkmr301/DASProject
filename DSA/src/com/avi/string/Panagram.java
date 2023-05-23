package com.avi.string;

public class Panagram {
	public static void main(String[] args) {
		
		String string = "THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
		
		panagramCode(string);
	}
	//All 26 alphabet letter should be there 
	 static void panagramCode(String string) {
		string =string.replace(" ", "");
		char[] c = string.toCharArray();
		int size = c.length;
		
		int[] x = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; 
		
		int i=0;
		while (i != size) {
			int index =c[i]-65;
			x[index] =1;
			++i;
		}
		i=0;
		while (i !=26) {
			if(x[i]==1) {
				++i;
			}else {
				System.out.println("not Panagram");
				System.exit(0);
			}			

		}
		System.out.println("It is Panagram!");
	}
}
