package com.lumen.basic;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []marks= {10,20,30,40,50};
		int result=0;
		for(int mark:marks) {
			if(mark>result) {
				result=mark;
			}
		}
		System.out.println("Greatest "+result);

	}

}
