package com.itp.model;

import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	private String carModelName;
	private String carMfgName;
	private String carColor;
	private double carPrice;
	
	@Autowired
	@Qualifier("e2")
	private Engine engine;
	@Autowired
	@Qualifier("g2")
	private Gear gear;
	
	public Car() {
		System.out.println("No args constructor is running");
	}
	public Car(String carModelName, String carMfgName, String carColor, double carPrice, Engine engine, Gear gear) {
		this.carModelName = carModelName;
		this.carMfgName = carMfgName;
		this.carColor = carColor;
		this.carPrice = carPrice;
		this.engine = engine;
		this.gear = gear;
	}
	
	
	public Car(String carModelName, String carMfgName, String carColor, double carPrice) {
		this.carModelName = carModelName;
		this.carMfgName = carMfgName;
		this.carColor = carColor;
		this.carPrice = carPrice;
		
	}
	
	public String getCarModelName() {
		return carModelName;
	}
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	public String getCarMfgName() {
		return carMfgName;
	}
	public void setCarMfgName(String carMfgName) {
		this.carMfgName = carMfgName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
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
		return "Car [carModelName=" + carModelName + ", carMfgName=" + carMfgName + ", carColor=" + carColor
				+ ", carPrice=" + carPrice + ", engine=" + engine + ", gear=" + gear + "]";
	}
	
	public void StartCar() {
		engine.startEngine();
		gear.GearShift();
	}
}
