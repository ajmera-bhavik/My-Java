package com.arrays;

import java.util.*;

public class Max_Min{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int size = sc.nextInt();
		
		int []num = new int[size];
		
		for(int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < num.length; i++) {
			if(max <= num[i]) {
				max = num[i];
			}else {
				min = num[i];
				

			}
		}
		System.out.println("Max Value Is : " + max);
		System.out.println("MIn Value Is : " + min);
	}
}