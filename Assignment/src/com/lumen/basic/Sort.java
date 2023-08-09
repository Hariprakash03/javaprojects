package com.lumen.basic;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []marks= {10,20,30,40,50,4,5};
		int temp=0;
		int length=marks.length;
		for(int i=0;i<length;i++) {
			for(int j=1;j<length-i;j++) {
				if(marks[j-1]>marks[j]) {
					temp=marks[j-1];
					marks[j-1]=marks[j];
					marks[j]=temp;
				}
			}
		}
		for(int mark:marks)
			System.out.println(mark+" ");

	}

}
