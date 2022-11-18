package com.masai.day2;

public abstract class Animal {

	String  name;

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(String name) {
		super();
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	 
	 void sleep()
	   {
		   System.out.println(name + " is Sleeping");
	   }
	
	   abstract void makeNoise();
	   
	   abstract void eat();
	   
	   
	   
}
