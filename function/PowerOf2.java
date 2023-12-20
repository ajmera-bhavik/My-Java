
//Write a program to find if a number is a power of 2 or not.

package com.function;

import java.util.*;

public class PowerOf2{
	public static boolean isPowerOf(int x) {
		if(x == 0)
			return false;
		while(x != 0) {
			if(x % 2 != 0) {
				return false;	
			}
			x = x / 2;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(isPowerOf(n)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}