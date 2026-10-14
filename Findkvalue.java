package com.arrays;

import java.util.Arrays;

public class Findkvalue {
//sum of subarray only  
	public static void main(String[] args) {
		
		int[] arr = {10,20,7,5};
		int k = 37;
		int[] ksum = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			int cursum=0;
			for(int j=i; j<arr.length;j++) {	
				cursum = cursum+arr[j];
				if(cursum==k) {
					int index=0;
					for(int l=i;l<=j;l++) {
					ksum[index++]=arr[l];
				   }		
			   }
			}
		}
		
		System.out.println(Arrays.toString(ksum));
	}

}
