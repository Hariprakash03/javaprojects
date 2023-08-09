package com.lumen.basic;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=28;
		int sum=0;
		for(int i=1;i<28;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		//System.out.println(sum);
		if(sum==num)
			System.out.println(num+"is aPerfect number");
	}

}
