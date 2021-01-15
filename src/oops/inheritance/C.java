package oops.inheritance;

public class C extends B {
	private int length;
	private String type;

	public C(int length, String type) {
		System.out.println("C constructor called!!!");
		this.length = length;
		this.type = type;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
