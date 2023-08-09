package com.voterapp.main;
import java.util.Scanner;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.service.*;
public class VoterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter age ");
		int age=scanner.nextInt();
		System.out.println("Enter your area");
		String locality=scanner.next();
		System.out.println("Enter your voterId");
		int voterId=scanner.nextInt();
		IElectionBooth election=new ElectionBoothImpl();
		ElectionBoothImpl electionBooth=new ElectionBoothImpl();
		try {
			if(election.checkEligibility(age,locality, voterId))
				System.out.println("Voter is eligible ");
		} catch (InValidVoterException e) {
			// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		}

	}

}
