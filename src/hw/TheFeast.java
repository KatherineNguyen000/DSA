package hw;

import java.util.Scanner;

public class TheFeast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The number of test cases : ");
		int t = sc.nextInt(); // number of test cases

		for (int i = 0; i < t; i++) {
			System.out.println();
			System.out.println("The amount of money Bobby has:");
			int n = sc.nextInt();
			System.out.println("Each chocolate bar cost him:");
			int c = sc.nextInt();
			System.out.println("The number of wrappers he can turn in for a free bar:");
			int m = sc.nextInt();

			int totalChocolateBar = theFeast(n, c, m);
			System.out.println("--- Total number of chocolate bars Bobby can eat : " + totalChocolateBar);
		}
		sc.close();
	}

	public static int theFeast(int n, int c, int m) {
		int chocoBars = n / c; // initial chocolate bars possibly bought
		int wrappers = chocoBars; // initial wrappers turned from initial chocolate bars

// Implement while loop to check if there are enough wrappers to turn in for a free chocolate bar
		while (wrappers >= m) {
			int freeChocoBars = wrappers / m;
			chocoBars += freeChocoBars;
			wrappers = freeChocoBars + (wrappers % m); // update the number of wrappers
		}
		return chocoBars; // total number of chocolate bars Bobby can eat
	}
}
// Time complexity O(log n)
