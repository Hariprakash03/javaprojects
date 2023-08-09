package com.lumen.abss;

public abstract class Vehicle {
	String model;
	String brand;
	double price;
	void printDetails() {
		System.out.println("Model "+model);
		System.out.println("brand "+brand);
		System.out.println("Price "+price);
	}
	abstract void getMileage();
	abstract void showType();
	public Vehicle(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	
}
