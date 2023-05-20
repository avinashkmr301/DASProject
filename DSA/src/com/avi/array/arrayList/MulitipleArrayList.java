package com.avi.array.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MulitipleArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element");
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		// here we are passing ArrayList it self, so we have to initialize first
		
		//initialization
		for (int i = 0; i <4; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				list.get(i).add(sc.nextInt());
			}
		}
		System.out.println(list);
	}

}
