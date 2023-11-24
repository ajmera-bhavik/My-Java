//Write a function which takes in 2 numbers and returns the greater of those two.

package com.exercise_1;

import java.util.*;

public class Fun_project_3{
	public static int greaterNum(int a, int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int greaterN = greaterNum(a, b);
		
		System.out.println(greaterN  + " IS A Greastest Number of those Two numbers");
	}
}