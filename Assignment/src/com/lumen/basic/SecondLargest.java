package com.lumen.basic;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []marks= {10,20,30,50,60,9};
		Arrays.sort(marks);
		System.out.println(marks[marks.length-2]);
		
	}

}
