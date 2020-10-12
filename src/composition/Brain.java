package composition;

public class Brain {
	private String nueron;
	private String middillaAmblangeta;
	
	public Brain(String nueron, String middillaAmblangeta) {
		this.nueron = nueron;
		this.middillaAmblangeta = middillaAmblangeta;
	}
	
	public String getNueron() {
		return nueron;
	}
	public void setNueron(String nueron) {
		this.nueron = nueron;
	}
	public String getMiddillaAmblangeta() {
		return middillaAmblangeta;
	}
	public void setMiddillaAmblangeta(String middillaAmblangeta) {
		this.middillaAmblangeta = middillaAmblangeta;
	}

	@Override
	public String toString() {
		return "Brain [nueron=" + nueron + ", middillaAmblangeta=" + middillaAmblangeta + "]";
	}
	
}
