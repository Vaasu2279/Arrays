package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Mixed_operations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number for rows");
		int rows = sc.nextInt();
		System.out.println("enter the number for cols");
		int cols = sc.nextInt();
		
		int[][] arr = new int [rows][cols];
		
		for(int i =0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
			System.out.println("enter the values");
			arr[i][j] = sc.nextInt();	
			}
		}
		for(int i =0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
			
	}
}
