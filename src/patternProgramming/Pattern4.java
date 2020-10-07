package patternProgramming;

import java.util.Scanner;

public class Pattern4 {
	// i + i - 1
	// (2*i) -1
	
//    *
//   *** 2 + 1
//  *****3 + 2
// *******
//*********
// *******
//  *****
//   ***
//    *
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scr.nextInt(); // 5
		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// stars
			for (int k = 1; k <= ((2*i) - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//n = 5
		
		//i - 4
		//i - 3
		//i - 2
		//i - 1
		for (int i = (n-1); i >= 1; i--) {
			// spaces
			for (int j = 1; j <= (n-i); j++) {
				System.out.print(" ");
			}
			// starts
			for (int j = ((2*i)-1); j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
