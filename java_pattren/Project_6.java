package com.java_pattren;
 
public class Project_6{
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int b = 1; b <= n-i; b++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= n; j++) {
				if(j == 1 || i == n || j == n || i == 1)
					System.out.print("*");
			
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}