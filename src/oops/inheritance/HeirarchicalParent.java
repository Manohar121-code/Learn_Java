package oops.inheritance;

public class HeirarchicalParent {
	private int id;
	private String name;

	public HeirarchicalParent(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public HeirarchicalParent() {
		
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

}
