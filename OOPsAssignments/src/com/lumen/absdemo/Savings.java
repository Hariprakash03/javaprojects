package com.lumen.absdemo;

public class Savings extends Bank {

	public Savings(double balance) {
		super(balance);
		}

	@Override
	void withdraw(double amount) {
		double temp=balance-amount;
		if(temp<0) {
			System.out.println("Insufficient balance");
		}
		else {
			balance-=amount;
			System.out.println("Your amount is successfully withdrawed from Savings "+amount+" available amount "+balance);

		}

		
	}

	@Override
	void deposit(double amount) {
		balance+=amount;
		System.out.println("Your amount is successfully deposited in Savings "+balance);
		
	}

}
