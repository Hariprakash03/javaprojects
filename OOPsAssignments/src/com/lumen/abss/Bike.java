package com.lumen.abss;

public class Bike extends Vehicle{

	public Bike(String model, String brand, double price) {
		super(model, brand, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getMileage() {
		// TODO Auto-generated method stub
		System.out.println("Mileage is moderate");
		
	}

	@Override
	void showType() {
		// TODO Auto-generated method stub
		if(model.equals("X-pulse"))
			System.out.println("OffRoad");
		else
			System.out.println("On-Road");
		
		
	}
	void engineType() {
		System.out.println("BS6");
	}
	

}
