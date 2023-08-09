package com.lumen.basic;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=5;
		int result=1;
		for(int i=value;i>0;i--) {
			result*=i;
		}
		System.out.println(result);

	}

}
