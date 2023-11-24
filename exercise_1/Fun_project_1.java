//Enter 3 numbers from the user & make a function to print their average.
package com.exercise_1;

import java.util.*;

public class Fun_project_1{
	public static void printAverage(int a, int b, int c) {
		int avg = (a + b + c) / 3;
		System.out.println(avg);
		return;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		printAverage(a, b, c);
	}
}