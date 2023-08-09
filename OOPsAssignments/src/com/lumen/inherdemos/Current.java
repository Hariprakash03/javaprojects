package com.lumen.inherdemos;

import com.lumen.inherdemos.Account;

public class Current extends Account{

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		balance-=amount;
		System.out.println("Your amount is successfully withdrawed from current "+amount+" available amount "+balance);

	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		balance+=amount;
		System.out.println("Your amount is successfully deposited in current "+amount);

		
	}
	
	

}
