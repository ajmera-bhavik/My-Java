package com.java_pattren;

public class Second_p{
	public static void main(String[] args) {
		int n = 4, m = 5;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				if(j == 1 || i ==1 || i == n || j == m) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}