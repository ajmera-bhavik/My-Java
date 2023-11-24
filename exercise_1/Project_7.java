//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

package com.exercise_1;
import java.util.*;

public class Project_7{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int positive = 0, nagetive = 0, zeros = 0;
		System.out.println("Enter 1 to Start: ");
		int input = sc.nextInt();
		while(input == 1 ) {
			System.out.println("Enter Positive - Nagetive & Zero:");
			int number = sc.nextInt();
			if (number > 0) {
				positive++;
			}else if(number < 0) {
				nagetive++;
			}else {
				zeros++;
			}
			System.out.println("Want To Continue To Press -> 1");
			input = sc.nextInt();
		}
		System.out.println("You Type Postive Number -> " + positive);
		System.out.println("You Type Nagetive Number -> " +  nagetive);	
		System.out.println("You Type Zeros Number -> " +  zeros);
	}
}