package edu.smg;

public class Sum {
	
	
	public static void main(String[] args) {
	   	 System.out.println("Sum is " + xMethod(5));
	}
	//recursion
	/* public static int xMethod(int n) {
	   	 if (n == 1)
	   		 return 1;
	   	 else
	   		 return n + xMethod(n - 1);
	} */
	
	//iteration
	public static int xMethod(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
	   	 return sum;
	}

}
