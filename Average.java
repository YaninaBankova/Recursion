package edu.smg;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {4, 8, 9, 3, 20};
		System.out.println("Average: " + findAverage(array));
	}
	
	public static double findAverage(int[] array) {
		return findAverage(array,array.length, 0) / array.length;
	}
	
	public static double findAverage(int[] array,int length, double sum) {
		if(length == 0) {
			return sum;
		}
		sum += array[length - 1];
		return findAverage(array, length - 1 , sum);
	}

}
