//Demo And Exmpale OF 2D Array
package com.array_2D;

import java.util.*;

public class Demo{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][] matrix = new int[n][m];
		
//		input 
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
//		Output
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}