package com.arrays;

//import java.util.Arrays;

public class three_matrix {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}};
		int left=0;
		int right=0;
		int n= arr.length;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
					left+= arr[j][i];
				}
				//if(i+j==n-1-i) {
				//	left +=arr[i][j];
				//}
			}
		}
		//System.out.println(Arrays.deepToString(arr));
		System.out.print(left);
		//System.out.println(right);
	}

}
