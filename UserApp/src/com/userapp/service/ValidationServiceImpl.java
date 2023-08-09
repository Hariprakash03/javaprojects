package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {

	@Override
	public boolean validateUserName(String username) throws NameExistsException {
		// TODO Auto-generated method stub
		String[]usernames= {"Hari","Sanjay","Sathish","Sanjana"};
		//int count=0;
		for(String name:usernames) {
			if(name.equals(username))
				throw new NameExistsException("User already exists");
			//count++;
		}
		return true;
	}

	@Override
	public boolean validatePassword(String password) throws TooShortException, TooLongException {
		// TODO Auto-generated method stub
		if(password.length()<6) {
			throw new TooShortException("Password is too short");			
		}
		else if(password.length()>14) {
			throw new TooLongException("Password is too long");
		}
		return true;
		}
		
	}

