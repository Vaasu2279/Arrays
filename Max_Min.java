package com.arrays;

public class Max_Min {

	public static void main(String[] args) {
		
		
		int[] num = {2,1,8,6,5,7,2,-3};
		
		
		int min =num[0];
		int max =num[0];
		
		System.out.println(num);
	
			for(int i=0; i<num.length;i++) {
				
				if(num[i]<min) {
					min=num[i];
				}
				else if(num[i]>max) {
					max=num[i];
				}
		}
			System.out.println(min);
			System.out.println(max);
		
	}

}
