package oops.inheritance;

public class A {
	private int id;
	private String name;
	
	public A() {
		
	}
	
	public A(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Parent [id=" + id + ", name=" + name + "]";
	}
	
}
