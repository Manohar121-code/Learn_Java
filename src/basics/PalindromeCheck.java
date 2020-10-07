package basics;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the number of inputs");
		int totalInputs = scr.nextInt();
		for (int i = 1; i <= totalInputs; i++) {
			System.out.println("enter the " + i + " string to check palindrome");
			String input = scr.next();
			boolean palindrome = isPalindrome(input);
			if (palindrome) {
				System.out.println(input + " - is a palindrome");
			} else {
				System.out.println(input + " - is not a palindrome");
			}
		}
	}

	private static boolean isPalindrome(String input) {
		String res = "";//dcba
		//abcd
		//0123
		for (int index = input.length() -1; index >= 0; index--) {
			char charAt = input.charAt(index);
			res = res + charAt;
		}
		boolean check = (res.equals(input));
		return check;
	}
}
