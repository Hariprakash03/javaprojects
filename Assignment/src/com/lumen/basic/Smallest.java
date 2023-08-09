package com.lumen.basic;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []marks= {10,20,30,40,50};
		int result=Integer.MAX_VALUE;
		for(int mark:marks) {
			if(mark<result) {
				result=mark;
			}
		}
		System.out.println("Smallest "+result);


	}

}
