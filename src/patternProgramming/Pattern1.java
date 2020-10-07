package patternProgramming;

import java.util.Scanner;

public class Pattern1 {
//    *
//   **
//  ***
// ****
//*****
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scr.nextInt(); //5
		//i = 1 -> j = 4 && k = 1
		//i = 2 -> j = 3 && k = 2
		//i = 3 -> j = 2 && k = 3
		//.
		//.
		for (int i = 1; i <= n; i++) {
			//spaces
			for (int j = 1; j <= (n-i); j++) {
				System.out.print(" ");
			}
			//stars
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
