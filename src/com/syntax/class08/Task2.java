package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	for(int i = 1; i<=3; i++) {
		System.out.println("I am i loop "+i);
		for(int j =1; j<=2; j++) {
			System.out.println("I am nested j loop "+j);
		}
	}	
	System.out.println("-----------------------------------------");	
	for(int k=10; k<=4; k++) {
		System.out.println(k);
		for(int l=1;l<=3; l++) {
			System.out.println(k);
		}
	}	
	for(int a=0; a<=9; a++) {
		for(int b=0; b<=9; b++) {
			for(int c=0; c<=9; c++) {
				System.out.println(a+" "+b+" "+c);
			}
		}
	}	
		
		
		
	}

}
