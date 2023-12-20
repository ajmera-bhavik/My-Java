package com.recursion;

public class OneToFive{
	public static void printRecursion(int n) {
		if(n == 6) {
			return;
		}
		System.out.println(n);
		printRecursion(n+1);
	}
	public static void main(String[] args) {
		int n = 1;
		printRecursion(n);
	}
}