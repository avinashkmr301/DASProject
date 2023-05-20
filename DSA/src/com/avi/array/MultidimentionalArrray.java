package com.avi.array;

import java.util.Arrays;
import java.util.Scanner;
//2D Array
public class MultidimentionalArrray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter element");
		
		/*
		 * two dimentional array
		 * int [][] arr= new int[row][column] row is compulsory to define and cloumn ca vary 
		 */
		
		
		/*
		 * int[][] ar = { {1, 2, 3}, {4 ,5, 6}, {7, 8, 9,5} };
		 */
		int[][] a = new int[3][3];
		//input
		for (int row = 0; row <a.length; row++) {
			for (int col = 0; col<a[row].length; col++) {
				a[row][col]= scanner.nextInt();
			}
		}
		
		//output
		
		/*
		 * for (int row = 0; row < a.length; row++) { 
		 *    for (int col = 0; col <a[row].length; col++)
		 *  { System.out.print(a[row][col] +" " ); }
		 * System.out.println(); }
		 */
		
		/*
		 * for (int row = 0; row < a.length; row++) {
		 * System.out.println(Arrays.toString(a[row])); }
		 */
		
		for (int[] is : a) {
			System.out.println(Arrays.toString(is));
		}
		
	}

}
