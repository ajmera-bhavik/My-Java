//Make a function to print the table of a given number n.

package com.function;

import java.util.*;

public class Table_print{
	public static void printTable(int n) {
		int num = 1;
		for(int i = 1; i <= 10; i++) {
			num = i * n;
			System.out.println(n + " * " + i + " = " + num);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		printTable(n);
	}
}