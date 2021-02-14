package edu.smg;

public class Exponents {
	
	public static void main(String[] args) {
		System.out.println(powRecursive(2, 3));
	}
	
//	public static int powRecursive( int x, int n ) {
//	   	 if (n == 0) {
//	   		 return 1;
//	   	 }
//	   	 
//	   	 return x * powRecursive(x, n - 1 );
//	}
	public static int powRecursive( int x, int n ) {
	   	 return powRecursive(x, n, 1);
	}
	
	public static int powRecursive( int x, int n, int result ) {
	   	 if (n == 0) {
	   		 return result;
	   	 }
	   	 result *= x;
	   	 return powRecursive(x, n - 1, result);
	}

}
