package oops.constructor;

public class PersonMain {
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
	}
}
