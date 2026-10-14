package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Separations {

	public static void main(String[] args) {
		
		System.out.println("enter your length ");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		
		
//		int[] positive = new int[len];
//		int[] zeros    = new int[len];
//		int[] negative = new int[len];
		
		int pos =0;
		int neg =0;
		int zer =0;
		
		int[] x = new int[len];
		
		for(int i= 0;i<len;i++) {
			System.out.println("enter your number");
			x[i] = sc.nextInt();
			
		}
		System.out.println(Arrays.toString(x));
		int posount=0;
		int negcount=0;
		int zerocount=0;
		
for(int i=0;i<x.length;i++) {
		
			
			if(x[i]>0) {
				
				
				posount++;
				
			}
			else if(x[i]<0) {
			
				negcount++;
			}
			else {
				
				zerocount++;
			}
			
		}
		
		
int[] positive = new int[posount];
int[] zeros1    = new int[negcount];
int[] negative = new int[zerocount];
		for(int i=0;i<x.length;i++) {
		
			
			if(x[i]>0) {
				
				positive[pos++] = x[i];
				
			}
			else if(x[i]<0) {
			
				negative[neg++] = x[i];
			}
			else {
				
				zeros1[zer++] = x[i];
			}
			
		}
		
		System.out.println("your positive numbers are :"+ Arrays.toString(positive));
		System.out.println("your negative numbers are :"+ Arrays.toString(negative));
		System.out.println("your zeros numbers are : "+Arrays.toString(zeros1));	
	}

}
