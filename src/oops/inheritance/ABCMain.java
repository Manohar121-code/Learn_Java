package oops.inheritance;

public class ABCMain {
	public static void main(String[] args) {
		C obj = new C(10, "xType");
		System.out.println("Object created!!!");
		obj.setId(1000);
		obj.setName("java tutorial");
		obj.setPhone(1001010);
		obj.setAddress("bang");
		
//		System.out.println(obj.getId());
//		System.out.println(obj.getName());
//		System.out.println(obj.getPhone());
//		System.out.println(obj.getAddress());
//		System.out.println(obj.getLength());
//		System.out.println(obj.getType());
	}
}
