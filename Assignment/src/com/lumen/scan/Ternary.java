package com.lumen.scan;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		int result=(a>b && a>c)?a:(b>c?b:c);
		System.out.println(result +" is the greatest");
		scanner.close();

	}

}
