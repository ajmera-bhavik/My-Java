package com.bitManipulation;

public class GetBit{
	public static void main(String[] args) {
		int n = 6; // 0110
		int pos = 3;
		int bitMask = 1<<pos;
		System.out.println(n);
		
		int bitM = ~(bitMask);
		
		
		int newN = bitM & n;
		System.out.println(newN);
	}
}