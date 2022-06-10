package com.syntax.reveiwclass6;

public class Student {

	// define attributes/fields = variables
	String name, lastName, address;
	int studentID, age;
	char grade;

	// define behavior = methods
	void study() {
		System.out.println(name + " Student is studying");
	}

	void doHomework() {
		System.out.println(name + " Student is doing homework");
	}

	// A class without a main method is not executable
	// to run the program, Java has to have the main method

	// Create a method that will return full name of a student in uppercase
	String getFullName() {
		return name.toUpperCase() + " " + lastName.toUpperCase();
	}

	// create a method to display full info of a student
	void printInfo() {
		System.out.println(name + " " + age + " " + address);
	}

}
