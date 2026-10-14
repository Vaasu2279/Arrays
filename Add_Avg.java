package com.arrays;

import java.util.Scanner;

public class Add_Avg {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your array length");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		int total =0;
		int avg =0;
		
		for(int i=0;i<len;i++) {
			System.out.println("enter your marks:");
			arr[i] = sc.nextInt();
			total =  total+arr[i];
		}
		
		avg = total/len;
		System.out.println("your total marks is :"+total);
		System.out.println("your average marks is :"+avg);

	}

}
