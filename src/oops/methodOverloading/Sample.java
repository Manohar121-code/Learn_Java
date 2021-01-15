package oops.methodOverloading;

public class Sample {
	public void m1() {
		System.out.println("m1() called!!!");
	}
	
	public void m1(int id) {
		System.out.println("m1(int id) called!!!");
	}
	
	public void m1(int id, int number) {
		System.out.println("m1(int id, int number) called!!!");
	}
	
	public void m1(String s) {
		System.out.println("m1(String s) called!!!");
	}
	
	public void m1(int id, String s) {
		System.out.println("m1(int id, String s) called!!!");
	}
	
	public static void main(String[] args) {
		Sample obj = new Sample();
		obj.m1();
		obj.m1(101001);
		obj.m1("gdshghs");
		obj.m1(10, 87987);
		obj.m1(11010, "java");
	}
}
