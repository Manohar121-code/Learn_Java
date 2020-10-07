package oops.constructor;

public class Person {
	int id;
	String name;
	int phone;
	String email;
	String address;
	String country;
	
	public Person() {
	}

	public Person(int id, String name, int phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	public Person(int id, String country) {
		this.id = id;
		this.country = country;
	}
	
	public Person(int id, String name, int phone, String email, String address, String country) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", address=" + address
				+ ", country=" + country + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
