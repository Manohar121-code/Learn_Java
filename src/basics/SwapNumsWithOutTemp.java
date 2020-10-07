package basics;

public class SwapNumsWithOutTemp {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		System.out.println("n1 - " + n1);
		System.out.println("n2 - " + n2);
		
		System.out.println("-------LOGIC-------");
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		
		//n1 - 30
		//n2 - 10
		
		System.out.println("---------------");
		System.out.println("n1 - " + n1);
		System.out.println("n2 - " + n2);
	}
}
