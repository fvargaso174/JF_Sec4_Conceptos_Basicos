package com.example.domain; // Package Declaration

import java.util.Scanner; // An Import Statement for other packages

public class Student { // Class Declaration for this file
	private int studentId; // Variable Declarations for this class
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	private String ssn;
	private double gpa;
	public final int SCHCODE = 34958;// A Constant Declaration

	public Student() { // A Constructor
	}// end constructor

	public Student(int x, String n, String s, double g) {
		studentId = x;
		name = n;
		ssn = s;
		gpa = g;
	}// end constructor

	public int getStudentId() { // An accessor Method
		return studentId;
	}// end method studentId

	public void setStudentId(int x) { // A mutator Method
		studentId = x;
	}// end method setStudentId

	public String toString() {
		String s1 = "";
		s1 = "Student Id: " + getStudentId() + "Student Name: " + getName() + "Student SSN: " + getSsn()
				+ "Student GPA: " + getGpa();
		return s1;
	}// end method toString
}// end class Student