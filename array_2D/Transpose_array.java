//For a given matrix of N x M, print its transpose.

package com.array_2D;

import java.util.*;
public class Transpose_array{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int [][]arr= new int[n][m];
		
//		input 
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
//		Output And Also TransPose
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}
		
	}
}