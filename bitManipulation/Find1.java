//Write a program to count the number of 1’s in a binary representation of the number.

package com.bitManipulation;

import java.util.*;

public class Find1{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println(n);
		System.out.println(Integer.toBinaryString(n));
		
		
		System.out.println(Integer.toBinaryString(n-1));

		  n = n & (n-1);
		  int count = 1;
		while(n !=0) {
			count++;
			n = n & (n-1);
		}
		System.out.println(count);
	}
}