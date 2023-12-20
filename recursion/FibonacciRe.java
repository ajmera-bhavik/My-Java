package com.recursion;

import java.util.*;
public class FibonacciRe{
	public static void printFib(int a, int b, int n) {
		if(n == 0) {
			return;
		}
		
		int c = a + b;
		System.out.println(c);
		printFib(b, c, n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println("0");
		System.out.println("1");
		printFib(0, 1, n-2);
	}
}