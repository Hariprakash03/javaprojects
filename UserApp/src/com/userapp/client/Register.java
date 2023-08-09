package com.userapp.client;

import java.util.Scanner;

import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.ValidationServiceImpl;

public class Register {

	public static void main(String[] args) throws TooShortException, TooLongException {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String username=scanner.nextLine();
		String password=scanner.nextLine();
		ValidationServiceImpl validation=new ValidationServiceImpl();
		try {
			boolean result=validation.validateUserName(username);
			if(result==true)
				System.out.println("Username Approved");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			boolean result=validation.validatePassword(password);
			if(result==true)
				System.out.println("Password is good");		
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		scanner.close();

	}

}
