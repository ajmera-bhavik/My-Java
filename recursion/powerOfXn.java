package com.recursion;

public class powerOfXn{
	public static int printPower(int x, int n) {
		if(n == 1) {
			return 1;
		}
		if(x == 0) {
			return 0 ;
		}
		
		int xMone = printPower(x, n-1);
		int finalX = x * xMone;
		return finalX;
	}
	public static void main(String[] args) {
		int x = 2, n = 5;
		int output = printPower(x, n);
		System.out.println(output);
	}
}