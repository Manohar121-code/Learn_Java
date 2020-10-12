package composition;

public class Lungs {
	private String airStorage;
	private int capacity;
	
	public Lungs(String airStorage, int capacity) {
		this.airStorage = airStorage;
		this.capacity = capacity;
	}
	
	public String getAirStorage() {
		return airStorage;
	}
	public void setAirStorage(String airStorage) {
		this.airStorage = airStorage;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Lungs [airStorage=" + airStorage + ", capacity=" + capacity + "]";
	}
	
}
