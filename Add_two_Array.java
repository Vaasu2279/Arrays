package com.arrays;
import java.util.Arrays;

public class Add_two_Array {

	public static void main(String[] args) {
	
		int[] a1 = {1,2,3};
		int[] a2 = {4,5,6};
		
		int maxlen = Math.max(a1.length, a2.length);
		System.out.println(maxlen);
		int[] result = new int[maxlen];
		
		for(int i=0;i<maxlen;i++) {
			
			int val1 = i<a1.length?a1[i]:0;
			int val2 = i<a2.length?a2[i]:0;
			result[i] = val1+val2;
		}
		System.out.println(Arrays.toString(result));
	}

}
