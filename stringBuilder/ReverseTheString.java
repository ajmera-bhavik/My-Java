package com.stringBuilder;

import java.util.*;
public class ReverseTheString{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		StringBuilder str = new StringBuilder("Bhavik");
		System.out.println(str.length());
		for(int i = 0; i < (str.length()/2); i++) {
			int front = i;
			int back = str.length()-1-i;
			
			char frontN = str.charAt(front);
			char backN = str.charAt(back);
			
			str.setCharAt(front, backN);
    		str.setCharAt(back, frontN);
		}
     	System.out.println(str);
	}
}