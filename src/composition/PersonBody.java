package composition;

public class PersonBody {
	private int aadharNo;
	private String name;
	private Heart heart;
	private Brain brain;
	private Lungs lungs;
	
	public PersonBody(int aadharNo, String name, Heart heart, Brain brain, Lungs lungs) {
		this.aadharNo = aadharNo;
		this.name = name;
		this.heart = heart;
		this.brain = brain;
		this.lungs = lungs;
	}
	
	public int getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Heart getHeart() {
		return heart;
	}
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	public Brain getBrain() {
		return brain;
	}
	public void setBrain(Brain brain) {
		this.brain = brain;
	}
	public Lungs getLungs() {
		return lungs;
	}
	public void setLungs(Lungs lungs) {
		this.lungs = lungs;
	}
	
	@Override
	public String toString() {
		return "PersonBody [aadharNo=" + aadharNo + ", name=" + name + ", heart=" + heart + ", brain=" + brain
				+ ", lungs=" + lungs + "]";
	}
	
}
