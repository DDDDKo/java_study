package car;

public class Train {
	private String trainNumber;
	private String departureStation;
	private String arrivalStation;
	protected boolean isStart;
	Train(String trainNumber, String departureStation, String arrivalStation, boolean isStart) {
		super();
		this.trainNumber = trainNumber;
		this.departureStation = departureStation;
		this.arrivalStation = arrivalStation;
		this.isStart = isStart;
	}
	String getTrainNumber() {
		return trainNumber;
	}
	void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	String getDepartureStation() {
		return departureStation;
	}
	void setDepartureStation(String departureStation) {
		this.departureStation = departureStation;
	}
	String getArrivalStation() {
		return arrivalStation;
	}
	void setArrivalStation(String arrivalStation) {
		this.arrivalStation = arrivalStation;
	}
	boolean isStart() {
		return isStart;
	}
	void setStart(boolean isStart) {
		this.isStart = isStart;
	}
	
}
