//Write a program to toggle a bit a position = “pos” in a number “n”. in java

package com.bitManipulation;

import java.util.*;
public class ToggleBit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 9;//1001
		int pos = 1;
        System.out.println("Binary representation: " + Integer.toBinaryString(n));
		int bitMask = 1<<pos;
		int newBit = ~(bitMask);
		
		int newNumber = newBit & n;
		System.out.println(n);
		System.out.println(newNumber);
	}
}