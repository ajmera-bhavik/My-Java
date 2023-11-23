package com.java_pattren;
 
public class Project_4{
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int b = 1; b <= 5-i; b++) {
				System.out.print(" ");
			}
			int num = 1;
			for(int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num = num * (i - j)/(j + 1);
			}
			System.out.println();
		}
	}
}