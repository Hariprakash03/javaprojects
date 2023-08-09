package com.lumen.scan;

import java.util.Scanner;

public class SumAvg {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[]marks=new int[5];
		for(int i=0;i<5;i++)
			marks[i]=scanner.nextInt();
		int sum=0;
		for(int mark:marks)
			sum+=mark;
		System.out.println("Sum "+sum);
		System.out.println("Avg "+sum/marks.length);
		scanner.close();
	}

}
