package com.masai.question1;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee extends Person implements Externalizable {
	
	private int salary;
	private String dept;
	private String workLocation;

	public Employee(int id, String name, int age,int salary,String workLocation) {
		
		super(id, name, age);
		this.salary = salary;
		this.workLocation = workLocation;
		
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getWorkLocation() {
		return workLocation;
	}

	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(salary);
		out.writeObject(dept);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		salary = in.readInt();
		
		dept = (String) in.readObject();
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", dept=" + dept + ", workLocation=" + workLocation + "]";
	}
	
	
	

}
