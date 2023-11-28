package com.array_2D;

public class  Spiral{
	public static void main(String[] args) {
		
		int matrix[][] = {{1,2,3,4,5},{5,4,3,2,1},{9,8,7,6,5},{6,7,8,9,0},{2,5,8,4,3}};
		int left = 0, right = 5-1;
		int top = 0, bottom = 5-1;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(matrix[i][j] + "\t");
			} 
			System.out.println();
		}
		
		System.out.println("Sperial Series Are: ");
		while(left <= right && top <= bottom) {
//			1
				for(int col=left; col <= right; col++) {
					System.out.print(matrix[top][col] + " ");
				}
				top++;
//			2
			
				for(int row=top; row<=bottom; row++) {
					System.out.print(matrix[row][right] +" ");
				}
				right--;
//			3
				
				for(int col=right; col>=left; col--) {
					System.out.print(matrix[bottom][col] + " ");
				}
				bottom--;
//				4
				
				for(int row=bottom; row>=top; row--) {
					System.out.print(matrix[row][left] + " ");
				}
				left++;
		}
	}
}