package oops.inheritance;

public class HeirarchicalChild2 extends HeirarchicalParent {
	private int quatity;
	private String brandName;

	public HeirarchicalChild2(int quatity, String brandName) {
		super();
		this.quatity = quatity;
		this.brandName = brandName;
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}
