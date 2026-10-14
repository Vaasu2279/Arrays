package com.arrays;

import java.util.Arrays;

public class Reverese {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		System.out.println("before reverse");
		System.out.println(Arrays.toString(arr));
		int left =0;
		int right = arr.length-1;
		int temp =0;
		while(left<right) {
			temp = arr[left];
			arr[left]=arr[right];
			arr[right]= temp;
			
			left++;
			right--;
		}
		System.out.println("after reverse");
		System.out.println(Arrays.toString(arr));
		
		sumarray();
		reverse2();
	}

	static void sumarray() {
		int[] arr = {10,20,30,40,50};
		int[] arr1 = new int[arr.length-1];
		
		for(int i=0;i<arr.length-1;i++) {
			arr1[i] = arr[i]+arr[i+1];
		}
		System.out.println("**********************");
		System.out.println(Arrays.toString(arr1));
	}
	
	static void reverse2() {
		
		int[] arr = {10,20,30,40,50};
		System.out.println("before reverse");
		System.out.println(Arrays.toString(arr));
		
		int[] arr1 = new int[arr.length];
		
		for(int i=0; i<arr.length;i++) {
			arr1[i]=arr[arr.length-1-i];
		}
		System.out.println("after reverse ");
		System.out.println(Arrays.toString(arr1));
	}
}
