package com.avi.array;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] a= {2,3,4,5,6};
		System.out.println(Arrays.toString(a));
		
		a[0]= 55;
		for (int i : a) {
			System.out.println(i);
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
