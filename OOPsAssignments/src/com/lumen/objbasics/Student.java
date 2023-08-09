package com.lumen.objbasics;

public class Student {
	String name;
	String department;
	int marks[];
	public Student(String name, String department,int...marks) {
		super();
		this.name = name;
		this.department = department;
		this.marks=marks;
	}
	void printDetails() {
		System.out.println("Name "+name);
		System.out.println("Department "+department);
	}
	int sum=0;
	String getGrades() {
		
		for(int mark:marks)
			sum+=mark;
		System.out.println("Total "+sum);
		System.out.println("Average "+sum/marks.length);
		int avg=sum/marks.length;
		if(avg>90) {
			return "A Grade";
		}			
		else if(avg>80) {
			return "B Grade";
		}
		else if(avg>70)
			return "C Grade";
		else if(avg>50)
			return "D grade";
		else
			return "Fail";	
	}
}
