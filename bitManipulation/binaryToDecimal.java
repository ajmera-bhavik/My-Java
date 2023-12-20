package com.bitManipulation;

import java.util.*;

public class binaryToDecimal{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		String binaryN = decimalToBinary(x);
		System.out.println("Binary Number is: " + binaryN);
		
		int deciNum = binaryToDecimal(binaryN);
		System.out.println("Decimal To Binary : " + deciNum);
	}
	public static String decimalToBinary(int x) {
		return Integer.toBinaryString(x);
	}
	public static int binaryToDecimal(String x ){
		return Integer.parseInt(x, 2);
	}
}