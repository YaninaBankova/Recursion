package edu.smg;

public class Backwards {
	
	public static void main(String[] args) {
	   	 xMethod(1234567);
	}
	
	//recursion
	/* public static void xMethod(int n) {
	   	 if (n > 0) {
	   		 System.out.print(n % 10);
	   		 xMethod(n / 10);
	   	 }
	 }
	 */
	
	//iteration
	public static void xMethod(int n) {
		while(n > 0) {
			System.out.print(n % 10);
			n /= 10;
		}
	}

}
