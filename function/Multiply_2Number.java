//Qs. Write a function to multiply 2 numbers

package com.function;

import java.util.*;
public class Multiply_2Number{
	public static int MultiplyNumber(int a , int b) {
		return a * b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(MultiplyNumber(x, y));
	}
}