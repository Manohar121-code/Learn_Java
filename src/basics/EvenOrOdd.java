package basics;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the number of inputs");
		int totalInputs = scr.nextInt();
		for (int i = 1; i <= totalInputs; i++) {
			System.out.println("enter the " + i + " string to check even/odd");
			int input = scr.nextInt();
			String res = isEvenOrOdd(input);
			System.out.println(input + " is " + res);
		}
	}

	private static String isEvenOrOdd(int input) {
//		if ((input % 2) == 0) {
//			return "even";
//		} else {
//			return "odd";
//		}
		return (input % 2) == 0 ? "even" : "odd";
	}
}
