package Model;

public class Engine {

	
	private String EngManufature;
	private int   EngineHP;
	private double EngineLiter;
	
	
	public Engine() {};

	public String getEngManufature() {
		return EngManufature;
	}

	public void setEngManufature(String engManufature) {
		EngManufature = engManufature;
	}

	public int getEngineHP() {
		return EngineHP;
	}

	public void setEngineHP(int engineHP) {
		EngineHP = engineHP;
	}

	public double getEngineLiter() {
		return EngineLiter;
	}

	public void setEngineLiter(double engineLiter) {
		EngineLiter = engineLiter;
	}

	public Engine(String engManufature, int engineHP, double engineLiter) {
		super();
		EngManufature = engManufature;
		EngineHP = engineHP;
		EngineLiter = engineLiter;
	}
	
	
	@Override
	public String toString() {
		return "Engine [EngManufature=" + EngManufature + ", EngineHP=" + EngineHP + ", EngineLiter=" + EngineLiter
				+ "]";
	}
	
	
}
