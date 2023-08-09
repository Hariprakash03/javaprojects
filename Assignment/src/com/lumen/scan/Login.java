package com.lumen.scan;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		String[]usernames= {"hari","geetha","dharshini","Shri"};
		Scanner scanner=new Scanner(System.in);
		String name=scanner.nextLine();
		int count=1;
		for(String uname:usernames) {
			if(uname.equals(name))
				count=0;
		}
		if(count==0)
			System.out.println("you are logged in");
		else
			System.out.println("Invalid username");
		scanner.close();
	}

}
