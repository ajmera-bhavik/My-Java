//Qs. Write a function to calculate the factorial of a number.

package com.function;
import java.util.*;

public class Factorial_Function{
	public static void FactorialN(int n) {
		int fact = 1;
		while(n != 0) {
			fact = fact * n;
			n--;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		FactorialN(n);
	}
}