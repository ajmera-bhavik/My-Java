//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another

package com.exercise_1;

import java.util.*;

public class Function_Project_1{
	public static void power(int x, int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= x;
		}
		System.out.println("Power Of " + x + " Is A : " + result);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter X: ");
		int x = sc.nextInt();
		System.out.println("Enter N: ");
		int n = sc.nextInt();
		
		power(x, n);
	}
}