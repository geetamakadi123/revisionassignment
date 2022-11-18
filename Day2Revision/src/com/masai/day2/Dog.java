package com.masai.day2;

public class Dog extends Animal{

	
	
	String breed;
	public Dog(String breed) {
		super();
		
		this.breed = breed;
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String breed) {
		super(name);
		this.breed = breed;
	}

	
	void play()
	{
		System.out.println(name + " " + breed + " is Playing");
	}
	
	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		  System.out.println("Dog is Makeingnoise!");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog is Eating!");
	}
	
	
	
	
	
	
}
