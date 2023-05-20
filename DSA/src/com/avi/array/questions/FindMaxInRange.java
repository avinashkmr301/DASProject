package com.avi.array.questions;

public class FindMaxInRange {
	
	public static void main(String[] args) {
		
		int[] arr = {34, 19, 998, 545, 67, 45, 8, 23};
		
		System.out.println("found max in range: "+ maxInRange(arr, 4, 7));
	}

	 static int maxInRange(int[] arr, int start, int end) {
		int max = arr[start];
		
		for (int i = start; i < end; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
