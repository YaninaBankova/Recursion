
package edu.smg;

public class Sum {
	public static void main(String[] args) {
	   	 System.out.println("Sum is " + xMethod(50));
	}

//	public static int xMethod(int n) {
//	   	 if (n == 1)
//	   		 return 1;
//	   	 else
//	   		 return n + xMethod(n - 1);
//	}
	public static int xMethod(int n) {
	   	 return xMethod(n, 1);
	}
	
	public static int xMethod(int n, int sum) {
	   	 if (n == 1)
	   		 return sum;
	   	 else {
	   		 sum += n;
	   		 return xMethod(n - 1, sum);
	   	 }
	}
}
