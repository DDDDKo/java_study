package car;

public class FreightTrain extends Train implements Vehicle{
	
	private double cargoWeight;

	FreightTrain(String trainNumber, String departureStation, String arrivalStation, boolean isStart, double cargoWeight) {
		super(trainNumber, departureStation, arrivalStation, isStart);
		this.cargoWeight = cargoWeight;
	}

	double getCargoWeight() {
		return cargoWeight;
	}

	void setCargoWeight(int cargoWeight) {
		this.cargoWeight = cargoWeight;
	}
	@Override
	public void accelerate() {
		System.out.println("화물 열차가 천천히 가속합니다!");
	}

	@Override
	public void stop() {
		System.out.println("화물 열차가 천천히 정차합니다!");
	}

	@Override
	public void setStart() {
		super.isStart = !isStart;
	}
}
