package com.arrays;

import java.util.Scanner;

public class Spiral {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number for row");
		int row = sc.nextInt();
		System.out.println("enter the number for col");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
		
		int top =0;
		int bottom = col-1;
		int left =0;
		int right = row-1;
		
		while(top <= bottom && left <= right) {
			
			for(int j =left;j<right;j++) {
				System.out.print(arr[top][j]+" ");
			}
			top++;
			for(int i=top;i<bottom;i++) {
				System.out.print(arr[i][right]+"");
			}
			right--;
			if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(arr[bottom][j] + " ");
                }
                bottom--; 
            }
			if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
			}  left++;
		}
		
	}
}
