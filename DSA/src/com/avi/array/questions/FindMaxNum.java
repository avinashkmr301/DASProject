package com.avi.array.questions;

public class FindMaxNum {
	public static void main(String[] args) {
		int[] arr = {34, 19, 998, 545, 67, 45, 87, 23};
		
		//System.out.println(max(arr));
		System.out.println("found max in range: "+maxInRange(arr, 4, 7));
	}
	//find Max in range(start-4 to end-7)
	//work on edge cases, like array being null
	static int maxInRange(int[] arr, int start, int end) {
		
		if (start > end) {
			return -1;
		}
		if (arr == null) {
			return -1;
		}
		
		int max = arr[start];
		
		for (int i = start; i < end; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	
	//Find Max function
	 static int max(int[] arr) {
		int max= arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

}
