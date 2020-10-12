package composition;

public class Heart {
	private String pump;
	private String motor;
	
	public Heart(String pump, String motor) {
		this.pump = pump;
		this.motor = motor;
	}
	
	public String getPump() {
		return pump;
	}
	public void setPump(String pump) {
		this.pump = pump;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	@Override
	public String toString() {
		return "Heart [pump=" + pump + ", motor=" + motor + "]";
	}
	
}
