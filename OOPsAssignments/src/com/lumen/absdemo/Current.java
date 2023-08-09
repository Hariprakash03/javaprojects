package com.lumen.absdemo;

public class Current  extends Bank {

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		double temp=balance-amount;
		if(temp<0) {
			System.out.println("Insufficient balance");
		}
		else {
			balance-=amount;
			System.out.println("Your amount is successfully withdrawed from Current "+amount+" available amount "+balance);
		}

		}

	@Override
	void deposit(double amount) {
		balance+=amount;
		System.out.println("Your amount is successfully deposited in current "+amount);
	}

}
