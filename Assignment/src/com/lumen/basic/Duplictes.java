package com.lumen.basic;

public class Duplictes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []marks= {10,20,30,40,50,10,20,20};
		int count=0;
		for(int i=0;i<marks.length;i++) {
			for(int j=i+1;j<marks.length;j++) {
				if(marks[i]==marks[j] && marks[j]!=-1) {
					count++;
					marks[j]=-1;
				}
			}
		}
		System.out.println(count);

	}

}
