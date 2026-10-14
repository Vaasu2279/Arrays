package com.arrays;

import java.util.Arrays;

public class Bubble_sort {

	public static void main(String[] args) {
		
		int[] arr = {5,6,8,2,7,2,4,3,9,3,4,69,6,9,65,6,6,8,8,5,7,3,0,3,10,5,7,5,69,7,4,1,2,3,4,5,6,7,8,9};
		int temp=0;
		int innerloop=0;
		int outerloop=0;
		
		System.out.println("before sort");
		System.out.println(Arrays.toString(arr));
		
		for(int i =0 ;i<arr.length-1;i++) {
			outerloop++;
			
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				innerloop++;
			}
		}
		System.out.println("after sort");
		System.out.println(Arrays.toString(arr));
		System.out.println("inner loop count : "+innerloop);
		System.out.println("outer loop count : "+outerloop);
	}

}
