package com.lumen.inherdemos;

import java.util.Scanner;

import com.lumen.inherdemos.Account;

public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double balance=scanner.nextDouble();
		double amount=scanner.nextDouble();
		double withdraw=scanner.nextDouble();
		
		Account account=new Savings(balance);
		account.deposit(amount);
		account.withdraw(withdraw);
		System.out.println(account.getBalance());
		
		account=new Current(balance);
		account.deposit(amount);
		account.withdraw(withdraw);
		System.out.println(account.getBalance());
		scanner.close();
		

	}

}
