package com.arrays;

public class practise {

	public static void main(String[] args) {

		int[][] arr = {
	            {1, 2, 3, 4},
	            {2, 3, 4, 5},
	            {3, 4, 5, 6},
	            {4, 5, 6, 7}
	        };
		        
		        
		        int left = 0;  
		        int right = 0; 
		        int sum = 0;
		        int n = arr.length;
		        
		        for(int i=0;i<arr.length;i++) {
		        	for(int j=0;j<arr.length;j++) {
		        	sum = sum+arr[i][j];
		        	if(i==j) {
		        		left = left+arr[i][j];
		        	}
		        	}
		        	right =right+ arr[i][n-1-i];
		        }
		        
		        System.out.println("Main diagonal sum (left) : " + left);   
		        System.out.println("Anti-diagonal sum (right): " + right); 
		        System.out.println("sum of array is          : " + sum);
		    }
	}


