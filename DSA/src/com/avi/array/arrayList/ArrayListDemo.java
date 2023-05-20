package com.avi.array.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array list element");
		ArrayList<Integer> aList= new ArrayList<>();
		
		/*
		 * aList.add(10); aList.add(20); aList.add(30); aList.add(40);
		 * System.out.println(aList);
		 * Iterator<Integer> itr=aList.iterator(); while (itr.hasNext()) { Integer
		 * integer = itr.next(); System.out.println(integer);
		 * 
		 * }
		 */
		
		//input
		
		for (int i = 0; i < 5; i++) {
			aList.add(sc.nextInt());
			
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(aList.get(i));
		}
		
		//System.out.println(aList);
	}

}
