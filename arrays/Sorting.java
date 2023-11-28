package com.arrays;

import java.util.*;

public class Sorting{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int size = sc.nextInt();
		int []arr = new int [size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean isAcceding = true;
		
		for(int i = 0; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				isAcceding = false;
			}
		}
		if(isAcceding) {
			System.out.println("IT is Acceding Order Array '\"' ");
		}else {
			System.out.println("IT is Not Acceding Order Array");
		}
	}
}