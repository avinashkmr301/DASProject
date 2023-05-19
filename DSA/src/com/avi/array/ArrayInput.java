package com.avi.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array element");
		
		// array of primitive
		//int[] arr = new int[5];
		/*
		 * arr[0] = 1; arr[1] = 12; arr[2] = 13; arr[3] = 154; arr[4] = 175;
		 */

		// System.out.println(arr[3]);

		// input
		/*
		 * for (int i = 0; i < arr.length; i++) { arr[i] = sc.nextInt(); }
		 */

		// output
		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
		 */

		// System.out.println(Arrays.toString(arr));

		/*
		 * for (int i : arr) { System.out.print(i + " "); }
		 */
		
		//Array of object
		
		String[] strings = new String[5];
		
		for (int i = 0; i < strings.length; i++) {
			strings[i] = sc.next();
		}
		
		System.out.println(Arrays.toString(strings));
	}

}
