package car;

public class Car {
	private String vin;
	private String color;
	protected boolean isStart;
	Car(String vin, String color, boolean isStart){
		this.vin = vin;
		this.color = color;
		this.isStart = isStart;
	}
	String getVin() {
		return vin;
	}
	void setVin(String vin) {
		this.vin = vin;
	}
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	boolean isStart() {
		return isStart;
	}
	void setStart(boolean isStart) {
		this.isStart = isStart;
	}
	
}

