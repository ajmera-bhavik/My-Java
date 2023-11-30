package com.stringBuilder;

import java.util.*;
public class setCharAt_Function{
	public static void main(String[] args) {
		StringBuilder sd = new StringBuilder("Bhavik");
		System.out.println(sd);
		sd.setCharAt(0, 'A');  // Always Remember CharAt Function Remove 'char' and That Place add new 'Char'.....
		System.out.println(sd);
	}
}