package edu.smg;

import java.util.Scanner;

public class XwithExponentN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a real number x.");
		double x = sc.nextDouble();
		System.out.println("Enter a positive integer n.");
		int n = sc.nextInt();
		System.out.println("x ^ n = " + result(n, x));
		sc.close();
		
	}
	
	//iteration
	public static double result(int n, double x) {
		double result = 1;
		for(int i = 0; i < n; i++) {
			result *= x;
		}
		return result;
	}
	
	
	
	//recursion
//	public static double result(int n, double x) {
//		if (n == 0) 
//			return 1;
//		else
//			return (x * result(n - 1, x));
//	}

}
