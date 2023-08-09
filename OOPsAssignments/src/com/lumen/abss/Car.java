package com.lumen.abss;

public class Car extends Vehicle{

	public Car(String model, String brand, double price) {
		super(model, brand, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getMileage() {
		// TODO Auto-generated method stub
		System.out.println("Mileage between 10 to 20");
		
	}

	@Override
	void showType() {
		// TODO Auto-generated method stub
		if(model.equals("Innova"))
			System.out.println("MVP");
		else if(model.equals("Creta"))
			System.out.println("Suv");
		else
			System.out.println("Sedan");
	}
	String[] showAccessories() {
		return new String[]{"carcover","bluetooth-set","car-fresher","Spare-tyre"};
	}

}
