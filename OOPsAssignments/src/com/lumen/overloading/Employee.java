package com.lumen.overloading;

public class Employee {
	String name;
	String designation;
	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	double calcBonus(double basicAllowance) {
		System.out.println("Programmer");
		return basicAllowance;
		
	}
	double calcBonus(double basicAllowance,double carAllowance) {
		System.out.println("Manager");
		return basicAllowance+carAllowance;
			
		}
	double calcBonus(double basicAllowance,double carAllowance,double houseAllowance) {
		System.out.println("Director");
		return basicAllowance+carAllowance+houseAllowance;
		
	}

}
