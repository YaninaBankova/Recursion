package edu.smg;

import java.util.Scanner;

public class TwoWithExponentN {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer n.");
		int n = sc.nextInt();
		System.out.println("2 ^ n = " + result(n));
		sc.close();
		
	}
	
	//iteration
	/* public static int result(int n) {
		int result = 1;
		for(int i = 0; i < n; i++) {
			result *= 2;
		}
		return result;
	}
	*/
	
	//recursion
	public static int result(int n) {
		if (n == 0) 
			return 1;
		else
			return 2 * result(n - 1);
	}
}
