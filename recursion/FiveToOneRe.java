package com.recursion;

public class FiveToOneRe{
	public static void printRecursion(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		printRecursion(n-1);
	}
	public static void main(String[] args) {
		int n = 5;
		printRecursion(n);
	}
}