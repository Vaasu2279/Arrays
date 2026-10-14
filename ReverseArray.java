package com.arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		int left =0 ;
		int right = arr.length-1;
		int temp =0;
		

		while(left<right) {
			
		    temp = arr[left] ;
			arr[left] = arr[right];
			arr[right] = temp;
			left ++;
			right--;
			
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
