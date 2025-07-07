package com.itp.model;

public class Engine {

	
	private String engineMfgName;
	private int engineLiter;
	private int engineCC;
	
	public Engine() {}
	
	public Engine(String engineMfgName, int engineLiter, int engineCC) {
		this.engineMfgName = engineMfgName;
		this.engineLiter = engineLiter;
		this.engineCC = engineCC;
	}
	
	public String getEngineMfgName() {
		return engineMfgName;
	}
	public void setEngineMfgName(String engineMfgName) {
		this.engineMfgName = engineMfgName;
	}
	public int getEngineLiter() {
		return engineLiter;
	}
	public void setEngineLiter(int engineLiter) {
		this.engineLiter = engineLiter;
	}
	public int getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	@Override
	public String toString() {
		return "Engine [engineMfgName=" + engineMfgName + ", engineLiter=" + engineLiter + ", engineCC=" + engineCC
				+ "]";
	}
	public void startEngine()
	{
		System.out.println("Engine is stated");
	}
}
