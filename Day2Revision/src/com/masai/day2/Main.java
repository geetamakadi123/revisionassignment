package com.masai.day2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		Animal a = new Dog("alexa", "jini");
		
		Dog b = (Dog)a;
		
		b.eat();
		b.makeNoise();
		b.play();
		b.sleep();
		
		System.out.println("============================================================");
		
		
		Animal c = new Cat("jony", "jimi");
		
		  Cat d = (Cat)c;
		  d.eat();
		  d.jump();
		  d.makeNoise();
		  d.sleep();
		
	}

}
