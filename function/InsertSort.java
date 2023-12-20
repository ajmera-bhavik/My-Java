package com.function;

import java.util.*;
public class InsertSort{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int size = sc.nextInt();
		int []arr = new int[size];
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=1; i<arr.length; i++) {
			int current = i;
			int j = i-1;
			while(j >= 0 && arr[j] > current) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j +1] = current;
		}
		printSortArray(arr);
	}
	public static void printSortArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}