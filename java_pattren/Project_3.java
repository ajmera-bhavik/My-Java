package com.java_pattren;
 
public class Project_3{
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int b = 1; b <= n- i; b++) {
				System.out.print(" ");
			}
			for(int j = i; j > 0; j--) {
				System.out.print(j );
			}
			for(int j = 2; j <= i; j++) {
				System.out.print(j );
			}
			System.out.println();
		}
	}
}