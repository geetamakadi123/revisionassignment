package com.masai.question1;

import java.io.Serializable;

public class Student extends Person implements Serializable {

	private static final long serialVersionUID = -2570789931328948511L;
	private int rollNo;
	

	public Student(int id, String name, int age,int rollNo) {
		super(id, name, age);
		
		this.rollNo = rollNo;
		
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + "]";
	}
	
	

}
