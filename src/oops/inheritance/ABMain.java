package oops.inheritance;

public class ABMain {
	public static void main(String[] args) {
		B b1 = new B(10000, "tirupati");
		b1.printValues();
		System.out.println("----------------");
		B b2 = new B();
		b2.printValues();
	}
}
