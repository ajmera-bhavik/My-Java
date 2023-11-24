//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

package com.exercise_1;

import java.util.*;

public class Fun_project_5{
	public static boolean eligibleVote(int age) {
		if (age > 18) {
			return true;
		}else {
			return false;
		}
	}
	public static void printYorN(boolean ans) {
		if(ans == true) {
			System.out.println("Eligible to vote");
		}else {
			System.out.println("Not A Eligible To Vote");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int age = sc.nextInt();
		
		boolean ans = eligibleVote(age);
		
		printYorN(ans);
	}
}