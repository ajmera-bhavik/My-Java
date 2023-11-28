package com.java;

import java.io.DataInputStream;
class Reading{
	public static void main(String[] args) {
		DataInputStream in = new DataInputStream(System.in);
		int intNumber = 0;
		float floatNumber = 0.0f;
		try {
			System.out.println("ENTER AN INTEGER");
			intNumber = Integer.parseInt(in.readLine());
			System.out.println("ENTER AN FLOAT NUMBER");
			floatNumber= Float.valueOf(in.readLine()).floatValue();
		}
		catch(Exception e) {}
		System.out.println("Int number" + intNumber);
		System.out.println("Float number" + floatNumber);
		
	}
}