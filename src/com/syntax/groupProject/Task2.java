package com.syntax.groupProject;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		
		//Create 2d array of integer values. Print the sum of all numbers.
		
		int[][]array2D= {{10,10,10},{20,20,20},{30,30,30}};
		
		int sum=0;
		for(int x=0; x<array2D.length; x++) {
			System.out.println(Arrays.toString(array2D[x]));
			for(int y=0; y<array2D[x].length;y++) {
				sum=sum+array2D[x][y];
			}
		}
		
		System.out.println("Sum of array elements is "+sum);
		
		
		
		
		

	}

}
