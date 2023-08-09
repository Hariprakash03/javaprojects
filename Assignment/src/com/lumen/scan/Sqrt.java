package com.lumen.scan;

import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int[]marks=new int[5];
		int[]sqrts=new int[5];
		
		for(int i=0;i<5;i++)
			marks[i]=scanner.nextInt();
		for(int i=0;i<5;i++) {
			sqrts[i]=(int) Math.sqrt(marks[i]);
		}
		for(int sqrt:sqrts)
			System.out.println(sqrt);
			

	}

}
