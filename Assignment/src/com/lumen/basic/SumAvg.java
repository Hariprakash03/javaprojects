package com.lumen.basic;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []marks= {10,20,30,40,50};
		int sum=0;
		for(int mark:marks)
			sum+=mark;
		System.out.println("Sum "+sum);
		System.out.println("Average "+sum/marks.length);

	}

}
