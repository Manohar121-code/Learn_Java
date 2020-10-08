package recursion;

public class Factorial {
	public static void main(String[] args) {
		int i = 5;
		int res = doFactorial(i);
		System.out.println(res);
		
		int resFromRecursion = doFactorialByRecursion(i);
		System.out.println(resFromRecursion);
	}

	private static int doFactorial(int i) {
		int res = 1;
		for (int j = 1; j <= i; j++) {
			res = res * j;
		}
		return res;
	}
	
	private static int doFactorialByRecursion(int i) {
		if (i == 0) {
			return 1;
		}
		return i * doFactorialByRecursion(i-1);
	}
}
