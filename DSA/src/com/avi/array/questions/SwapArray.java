package com.avi.array.questions;

import java.util.Arrays;

public class SwapArray {
	
	public static void main(String[] args) {
		int[] a = {2, 23, 45, 244, 45};
		swapArray(a, 0, 4);
		
		System.out.println(Arrays.toString(a));
	}
	static void swapArray(int[] a, int index1, int index2) {
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}

}
