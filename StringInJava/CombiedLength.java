//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
package com.StringInJava;

import java.util.*;

public class CombiedLength{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String[] arr = new String[size];
		
		int totalLength = 0;
		for(int i = 0; i<size; i++) {
			arr[i] = sc.next();
			
			totalLength = totalLength + arr[i].length();
		}
		System.out.println(totalLength);
	}
}