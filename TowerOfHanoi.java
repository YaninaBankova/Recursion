package edu.smg;

import java.util.Scanner;

public class TowerOfHanoi {
	public static int steps = 0;
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of disks: ");
		int n = input.nextInt();
		input.close();
		// Find the solution recursively
		System.out.println("The moves are:");
		moveDisks(n, 'A', 'B', 'C');
		System.out.println("The steps are: " + steps);
	}

	/**
	 * The method for finding the solution to move n disks from fromTower to toTower
	 * with auxTower
	 */
	public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
		if (n == 1) { // Stopping condition
			System.out.println("Move disk " + n + " from "+ fromTower + " to " + toTower);
			steps++;
		} else {
			moveDisks(n - 1, fromTower, auxTower, toTower);
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
			steps++;
			moveDisks(n - 1, auxTower, toTower, fromTower);
		}
	}
}
