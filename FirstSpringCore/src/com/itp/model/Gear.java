package com.itp.model;

public class Gear {
	
	private String gearMfgName;
	private int gearLever;
	private String gearType;
	
	public Gear() {}
	
	public Gear(String gearMfgName, int gearLever, String gearType) {
		this.gearMfgName = gearMfgName;
		this.gearLever = gearLever;
		this.gearType = gearType;
	}
	public String getGearMfgName() {
		return gearMfgName;
	}
	public void setGearMfgName(String gearMfgName) {
		this.gearMfgName = gearMfgName;
	}
	public int getGearLever() {
		return gearLever;
	}
	public void setGearLever(int gearLever) {
		this.gearLever = gearLever;
	}
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	@Override
	public String toString() {
		return "Gear [gearMfgName=" + gearMfgName + ", gearLever=" + gearLever + ", gearType=" + gearType + "]";
	}
	
	public void GearShift() {
		System.out.println("Shift from neural to First Gear");
	}
}
