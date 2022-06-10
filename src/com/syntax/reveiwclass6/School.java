package com.syntax.reveiwclass6;

public class School {

	public static void main(String[] args) {
		
	Student student1 = new Student(); //object creation
	
	student1.name="Tara";
	student1.lastName="Kalani";
	student1.address="Virginia";
	student1.studentID=100;
	student1.age=29;
	student1.grade='A';
	student1.printInfo();
	
	//student1.subject='Java'; can't use bc it wasn't defined in the Student class
	
	Student student2 = new Student();
	//accessing variables of Student class
	student2.name="Taraa";
	student2.lastName="Kalanii";
	student2.address="California";
	student2.studentID=101;
	student2.age=20;
	student2.grade='A';
	//accessing methods of student class
	student2.study();
	student2.doHomework();
	System.out.println(student2.getFullName());
	}
}
