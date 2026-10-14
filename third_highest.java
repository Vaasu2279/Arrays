package com.arrays;

public class third_highest {

	public static void main(String[] args) {
		
		int[] arr = {-70,-80,-60,-40,-50};
		int max = Integer.MIN_VALUE;;
		int secmax= Integer.MIN_VALUE;;
		int themax=Integer.MIN_VALUE;;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				themax=secmax;
				secmax=max;
				max=arr[i];
			}
			
			else if(arr[i]>secmax && arr[i]<max) {
				secmax=arr[i];
			}
			else if(arr[i]>themax && arr[i]<secmax) {
				themax= arr[i];
			} 
		}
		System.out.println(max);
		System.out.println(secmax);
		System.out.println(themax);
	}
}
