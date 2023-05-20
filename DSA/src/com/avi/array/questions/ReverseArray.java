package com.avi.array.questions;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		
		int[] arr = { 23, 45, 56, 12, 78, 55};
		
		/*
		 * swap(arr, 0, arr.length-1); System.out.println(Arrays.toString(arr));
		 */
		
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	//reverse array with the help of swapping
	
	static void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while (start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}
	}
	
	//swap two index
	static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp; 
	}
	
}
