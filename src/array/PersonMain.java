package array;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person(10, "India");
		Person p2 = new Person(20, "India2");
		Person p3 = new Person(30, "India3");
		
		p1.setPhone(87687);
		p1.setEmail("testmail@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		String email = Person.email;
		System.out.println("email - " + email);
		
		Person.m1();
	}
}
