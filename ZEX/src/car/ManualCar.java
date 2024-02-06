package car;

public class ManualCar extends Car implements Vehicle{	//수동 변속기 자동차
	private int gear;
	
	ManualCar(String vin, String color, boolean isStart, int gear) {
		super(vin, color, isStart);
		this.gear = gear;
	}

	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		if(gear>= 0 && gear <= 6) this.gear = gear;
		else System.out.println("잘못된 입력입니다");
	}
	
	@Override
	public void accelerate() {
		System.out.println("수동 변속기 자동차가 가속합니다!");
	}

	@Override
	public void stop() {
		System.out.println("수동 변속기 자동차가 정차합니다!");
	}

	@Override
	public void setStart() {
		super.isStart = !isStart;
	}
}
