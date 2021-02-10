package edu.smg;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		
		System.out.println("Enter a non-negative integer.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if (n >= 0) {
			System.out.println(odd(n)?"odd":"even");
			System.out.println(even(n)?"even":"odd");
		}
	}
	
	public static boolean odd(int n) {
		if(n == 0)
			return false;
		else if (n == 1)
			return true;
		else
			return odd(n - 2);
	}
	
	public static boolean even(int n) {
		if(n == 0)
			return true;
		else if (n == 1)
			return false;
		else
			return even(n - 2);
	}

}
