//CHARAT FUNCTION IN STRING 

package com.StringInJava;

import java.util.*;
public class CharAt_Fun{
	public static void main(String[] args) {
		String str = "Bhavik";
		System.out.println(str);
		int i = 0;
		while(str.length() != i) {
			System.out.print(str.charAt(i) + " ");
			i++;
		}
	}
}