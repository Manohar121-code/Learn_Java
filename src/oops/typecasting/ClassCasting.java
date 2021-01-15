package oops.typecasting;

public class ClassCasting {
	public static void main(String[] args) {
		//up casting
		A a = new B();
		a.m1();
		a.m2();
		a.m3();
		
		if (a instanceof B) {
			B b = (B) a;
		}
	}
}
