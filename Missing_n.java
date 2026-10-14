package com.arrays;

public class Missing_n {

	public static void main(String[] args) {
	
		int[] arr = {1,2,4,5};
		int temp =0;
		
		for(int i =0;i<arr.length;i++) {
			
			if(i!=arr[i]) {
			
				temp =i;
			}
		}
			System.out.println(temp);
	}

}
