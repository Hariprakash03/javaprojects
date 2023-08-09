package com.lumen.absdemo;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the account Type");
		String accountType = scanner.nextLine();
		System.out.println("Successfully created an account your welcome bonus of 1000 is added!");
		System.out.println("Welcome to" + accountType + "account");
		System.out.println("Enter the amount for deposit");
		double amount = scanner.nextDouble();

		if ("Savings".equals(accountType)) {
			Bank account = new Savings(1000);
			account.deposit(amount);
			System.out.println("Successfully added !Available balance Rs:"+(1000+amount));
			System.out.println("Enter the amount for withdrawal");
			double withdraw = scanner.nextDouble();
			account.withdraw(withdraw);
			System.out.println(account.getBalance());
		} else {
			Bank account;
			account = new Current(1000);
			System.out.println("Successfully added !Available balance Rs:"+(1000+amount));
			account.deposit(amount);
			System.out.println("Enter the amount for withdrawal");
			double withdraw = scanner.nextDouble();
			account.withdraw(withdraw);
			System.out.println(account.getBalance());
			scanner.close();
		}

	}

}
