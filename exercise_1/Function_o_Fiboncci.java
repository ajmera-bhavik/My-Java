package com.exercise_1;

import java.util.*;
public class Function_o_Fiboncci{
	public static void printFibonacci(int num) {
		int a = 0, b = 1, c =0;
		for(int i=1; i<=num; i++) {
			 a = b;
			 b = c;
			 c = a + b;
			 System.out.println(c);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		
		printFibonacci(num);
	}
}