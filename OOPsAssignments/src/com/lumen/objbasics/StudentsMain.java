package com.lumen.objbasics;

public class StudentsMain {
	public static void main(String[] args) {
		Student student=new Student("Geetha","CSE",new int[] {90,80,100,90,100});
		student.printDetails();
		String grade=student.getGrades();
		System.out.println(grade);
		Student student1=new Student("Hari","IT",new int[] {90,80,99,90,100});
		student1.printDetails();		
		String grade1=student1.getGrades();
		System.out.println(grade1);
		
	}

}
