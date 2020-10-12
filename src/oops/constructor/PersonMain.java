package oops.constructor;

public class PersonMain {
	static int i = 10;
	int j = 20;
	public static void main(String[] args) {
		Person manohar = new Person();
		System.out.println(manohar);
		System.out.println(manohar.getId());
		
		Person purna = new Person(10, "Purna", 76776, "purna@gmail.com", "pulicherla", "Pakistan");
		System.out.println(purna);
		
		Person nitheesh = new Person(11, "nitheesh", 676565);
		System.out.println(nitheesh.getPhone());
		nitheesh.setEmail("nitheesh@gmail.com");
		nitheesh.setAddress("pulicherla");
		nitheesh.setCountry("India");
		nitheesh.setPhone(1234);
		System.out.println(nitheesh);
		System.out.println(nitheesh.getPhone());
		
		Person chakri = new Person(12, "India");
		System.out.println(chakri);
		staticMethod();
		System.out.println(i);
//		System.out.println(j);
	}
	
	public static void staticMethod() {
		System.out.println("static() called!!!");
	}
	
	public void m1() {
		m2();
		System.out.println(i);
		System.out.println(j);
		staticMethod();
		System.out.println("m1() called!!!");
	}
	public void m2() {
		
		System.out.println("m2() called!!!");
	}
}
