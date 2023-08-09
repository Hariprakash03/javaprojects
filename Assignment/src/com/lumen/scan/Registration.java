package com.lumen.scan;

import java.util.Scanner;

public class Registration {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String names[]=new String[4];
		for(int i=0;i<3;i++) {
			names[i]=scanner.nextLine();
		}
//		for(String name:names) {
//			System.out.println(name);
//		}
		int count=1;
		names[3]=scanner.nextLine();
		for(String name:names) {
			if(name.equals(names[3])) {
				count=0;
			}
		}
		if(count==0) {
			System.out.println("Name not unique");
		}
		else {
			System.out.println("you are registerd");
		}
	}

}
