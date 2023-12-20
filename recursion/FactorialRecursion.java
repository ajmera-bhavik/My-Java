package com.recursion;

import java.util.*;
public class FactorialRecursion{
	public static void printFact(int n, int FactN) {
		if(n == 1 || n == 0) {
			System.out.println(FactN);
			return;
		}
		
		  FactN *= n;
		  printFact(n-1, FactN);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printFact(n, 1);
	}
}