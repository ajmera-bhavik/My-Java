package com.arrays;

import java.util.*;

public class Find_x{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int size = sc.nextInt();
	
		int [] arr = new int[size];
//		input
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		
//		output
		for(int i = 0; i <= arr.length; i++) {
			if(arr[i] == x) {
				System.out.println("X is Found  OF " + i + "th index");
			}
		}
	}
}