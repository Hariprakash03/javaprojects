package com.voterapp.service;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIDException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothImpl implements IElectionBooth {
	String[]localities= {"J.Krishnapuram","Pollachi","Sulur"};

	@Override
	public boolean checkEligibility(int age, String locality, int voterId) throws InValidVoterException {
		 checkAge(age);
		 checkLocality(locality);
		 checkVoterId(12);
		 return true;
	}
	private boolean checkAge(int age)throws UnderAgeException{
		if(age<18) {
			throw new UnderAgeException("You should be 18+");
		}
		return true;
	}
	private boolean checkLocality(String locality) throws LocalityNotFoundException {
		for(String localitie:localities) {
			if(localitie.equals(locality)) {
				return true;
			}
		}
		throw new LocalityNotFoundException("No vote for your locality");
		
	}
	private boolean checkVoterId(int voterId)throws NoVoterIDException{
		if(voterId>=1000 && voterId<=9999)
			return true;
		throw new NoVoterIDException("Voter id not found");
	}

}
