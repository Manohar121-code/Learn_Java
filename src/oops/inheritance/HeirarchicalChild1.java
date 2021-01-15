package oops.inheritance;

public class HeirarchicalChild1 extends HeirarchicalParent {
	private int prop1;
	private double prop2;

	public HeirarchicalChild1(int prop1, double prop2) {
		super();
		this.prop1 = prop1;
		this.prop2 = prop2;
	}

	public int getProp1() {
		return prop1;
	}

	public void setProp1(int prop1) {
		this.prop1 = prop1;
	}

	public double getProp2() {
		return prop2;
	}

	public void setProp2(double prop2) {
		this.prop2 = prop2;
	}

}
