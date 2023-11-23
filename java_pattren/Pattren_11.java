package com.java_pattren;
 
public class Pattren_11{
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int s = 1; s <= n-i; s++) {
				System.out.print(" ");
			}
			int star = (2 * i) - 1;
			for(int j = 1; j <=star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		Lawer part
		
		
		for(int i = n; i >= 1; i--) {
			for(int s = 1; s <= n-i; s++) {
				System.out.print(" ");
			}
			int star = (2 * i) - 1;
			for(int j = 1; j <=star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}