package com.recursion;

public class LogN{
	public static int printPower(int x, int n) {
		if(n == 0) {
			return 1;
		}
		if(x == 0) {
			return 0 ;
		}
		
		if(n % 2 == 0) {
			return printPower (x, n/2) *  printPower (x, n/2);
		}else {
			return printPower (x, n/2) *  printPower (x, n/2) * x;
		}
	}
	public static void main(String[] args) {
		int x = 2, n = 6;
		int output = printPower(x, n);
		System.out.println(output);
	}
}