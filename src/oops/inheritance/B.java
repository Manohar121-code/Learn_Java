package oops.inheritance;

public class B extends A {
	private int phone;
	private String address;
	
	public B() {
		System.out.println("B constructor called!!!");
	}
	
	public B(int phone, String address) {
		super();
		this.phone = phone;
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Child [phone=" + phone + ", address=" + address + "]";
	}
	
	public void printValues() {
		System.out.println(this.getId());
		System.out.println(this.getName());
		System.out.println(this.getPhone());
		System.out.println(this.getAddress());
	}
}
