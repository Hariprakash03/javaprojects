package com.lumen.scan;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		for(int i=1;i<=a;i++) {
			if(i%2==0)
				System.out.print(i+" ");
		}

	}

}
