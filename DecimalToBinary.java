package edu.smg;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("Enter an integer.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(dec2Bin(n));
		
	}
	
	public static String dec2Bin (int value) {
		if(value == 1)
			return "1";
		else 
			return dec2Bin(value / 2) + value % 2;
	}
}
