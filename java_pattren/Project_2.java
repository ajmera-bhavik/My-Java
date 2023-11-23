package com.java_pattren;
 
public class Project_2{
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int b = 1; b <= n-i; b++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}