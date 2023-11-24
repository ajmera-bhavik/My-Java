//Write a function to print the sum of all odd numbers from 1 to n.

package com.exercise_1;

import java.util.*;

public class Fun_project_2{
	public static void printOddSum (int num) {
		int sum = 0;
		for(int i = 1; i <= num; i = i + 2) {
			sum = sum + i;
		}
		System.out.println("Sum Of All Odd Number Are : " + sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int number = sc.nextInt();
		
		printOddSum(number);
	}
}