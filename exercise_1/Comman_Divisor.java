
//Write a function that calculates the Greatest Common Divisor of 2 numbers. 

package com.exercise_1;

import java.util.*;

public class Comman_Divisor {
	public static void divisor(int x1, int x2) {
		do {
			if (x1 > x2) {
				x1 -= x2;
			} else {
				x2 -= x1;
			}
		} while (x1 != x2);
		System.out.println("GCD is : " + x2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		
		divisor(x1, x2);
	}
}