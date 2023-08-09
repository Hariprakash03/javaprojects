package com.lumen.basic;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<10;i++) {
			int x=b;
			System.out.println(a+b);
			b=a+b;
			a=x;
			
		}

	}

}
