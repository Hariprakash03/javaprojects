
package com.lumen.basic;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		int val=1;
		for(int i=1;i<11;i++) {
			int count=0;
			while(count<i && val<11) {
				System.out.print(val);
				count++;
				val++;
				if(val>10) {
					break;
				}
			}
			System.out.println();
		}

	}

}
