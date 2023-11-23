package com.java;

import java.util.*;
public class If_Else{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int age = sc.nextInt();
		if(age > 18) {
			System.out.println("Eligible To vote");
		}
		else {
			System.out.println("Not Eligible To vote");
		}
	}
}