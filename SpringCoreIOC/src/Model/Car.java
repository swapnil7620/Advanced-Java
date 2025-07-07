package Model;

public class Car {

	private String CarName;
	private String CarCompnay;
	private double CarPrice;
	private int CarSeat;

	Engine engine;
	Gear gear;

	public Car() {
	}

	public Car(String carName, String carCompnay, double carPrice, int carSeat, Engine engine, Gear gear) {
		CarName = carName;
		CarCompnay = carCompnay;
		CarPrice = carPrice;
		CarSeat = carSeat;
		this.engine = engine;
		this.gear = gear;
	}

	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		CarName = carName;
	}

	public String getCarCompnay() {
		return CarCompnay;
	}

	public void setCarCompnay(String carCompnay) {
		CarCompnay = carCompnay;
	}

	public double getCarPrice() {
		return CarPrice;
	}

	public void setCarPrice(double carPrice) {
		CarPrice = carPrice;
	}

	public int getCarSeat() {
		return CarSeat;
	}

	public void setCarSeat(int carSeat) {
		CarSeat = carSeat;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Gear getGear() {
		return gear;
	}

	public void setGear(Gear gear) {
		this.gear = gear;
	}

	@Override
	public String toString() {
		return "Car[CarName=" + CarName + ", CarCompnay=" + CarCompnay + ", CarPrice=" + CarPrice + ", CarSeat="
				+ CarSeat + ",\nengine=" + engine + ",\ngear=" + gear + "]\n";
	}

}
