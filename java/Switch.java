package com.java;

import java.util.*;
public class Switch{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("If you Press 1 -> You see Addtion. If you Press 2 -> You see Substraction."
				+ " If you Press 3 -> You see Multiplication. If you Press 4 -> You see Divison."
				+ "If you Press 5 -> You see Remainder. ");
		
		int choice = sc.nextInt();
		switch(choice) {
		case 1: 
			choice = a + b;
			System.out.println(choice);
			break;
		
		case 2:
			choice = a- b;
			System.out.println(choice);
			break;
			
		case 3: 
			choice = a * b;
			System.out.println(choice);
			break;
		
		case 4:
			choice = a / b;
			System.out.println(choice);
			break;
			
		case 5:
			choice = a % b;
			System.out.println(choice);
			break;
			
		default:
			System.out.println("Invalid Number");
		}	
		
	}
}