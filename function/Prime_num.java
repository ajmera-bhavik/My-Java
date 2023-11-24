package com.function;

import java.util.*;

public class Prime_num{
	public static void isPrime(int number) {
		int flag = 1;
		for(int i = 2; i <= (number/2); i++) {
			if(number % i == 0) {
			flag = 0;
			break;
			}
		}
		if(flag == 1) {
			System.out.println(number + " is Prime Number");
		}else {
			System.out.println(number + " is  Not a Prime Number");
		}
		return;
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner (System.in);
		int number = sc.nextInt();
		isPrime(number);
	}
}