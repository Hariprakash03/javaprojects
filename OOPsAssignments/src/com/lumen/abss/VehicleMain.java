package com.lumen.abss;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle=new Bike("X-pulse","Hero",160000);
		vehicle.printDetails();
		vehicle.getMileage();
		vehicle.showType();
		
		Bike bike=(Bike)vehicle;
		bike.engineType();
		  
		vehicle=new Car("Innova","Toyota",2000000);
		vehicle.printDetails();
		vehicle.getMileage();
		vehicle.showType();
		 
		Car car=(Car)vehicle;
		for(String accessorie:car.showAccessories())
			System.out.println(accessorie+" ");
		
		

	}

}
