//Make a function to check if a given number n is even or not.
package com.function;

import java.util.*;

public class Check_Even{
	public  static void isEven(int num) {
		if(num % 2 == 0) {
			System.out.println(num  + " Is Even Number");
		}else {
			System.out.println(num  + " Is  Not a Even Number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int number = sc.nextInt();
		isEven(number);
	}
}