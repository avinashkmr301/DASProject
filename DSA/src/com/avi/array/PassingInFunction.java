package com.avi.array;

import java.util.Arrays;

public class PassingInFunction {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		System.out.println(Arrays.toString(a));
		
		change(a);
		System.out.println(Arrays.toString(a));
	}
	static void change(int[] arr) { //arr is pointing to original array(a) ..... arrays are immutable in java
		arr[0]=99;
	}

}
