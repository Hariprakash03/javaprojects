  package com.lumen.overloading;

public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee("Hari","Programmer");
		System.out.println(employee.calcBonus(1000));
		Employee employee1=new Employee("Dharshini","Manager");
		System.out.println(employee1.calcBonus(1000, 2000));
		Employee employee2=new Employee("Geetha","Director");
		System.out.println(employee2.calcBonus(1000, 2000,3000));
	}

}
