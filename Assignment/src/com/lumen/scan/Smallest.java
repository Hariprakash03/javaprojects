package com.lumen.scan;

import java.util.Scanner;

public class Smallest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		if(a<b&&a<c)
			System.out.println(a+" is the smallest");
		else if(b<c)
			System.out.println(b+" is the smallest");
		else
			System.out.println(c+" is the smallest");
			
			
	}

}
