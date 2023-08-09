
package com.lumen.basic;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=48;
		int res=0;
		while(num>0) {
			int temp=num%10;
			res=(res*10)+temp;
			num/=10;
		}
		System.out.println(res);

	}

}
