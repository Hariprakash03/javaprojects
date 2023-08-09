package com.lumen.inherdemos;

import com.lumen.inherdemos.Account;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		balance-=amount;
		System.out.println("Your amount is successfully withdrawed from Savings "+amount+" available amount "+balance);
	}

	@Override
	void deposit(double amount) {
		balance+=amount;
		// TODO Auto-generated method stub
		System.out.println("Your amount is successfully deposited in Savings "+balance);

	}
	
	
	

}
