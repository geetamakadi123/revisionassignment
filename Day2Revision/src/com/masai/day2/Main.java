package com.masai.day2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//	    Dog b = new Dog();
//	    
//	    b.breed = "labra";
//	    b.name =   "Tommy";
//		
//	    
//	    b.eat();
//	    b.sleep();
//	    b.makeNoise();
//	    b.play();
//		
//	    
//	    System.out.println("=================================");
//	    Cat a = new Cat();
//		 a.name = "chintu";
//		 a.nickname = "intu";
//		 
//		 a.sleep();
//		 a.makeNoise();
//		 a.eat();
//		 a.jump();
		
		
		Animal a = new Dog("Tommmy", "labora");
		
		Dog b = (Dog)a;
		
		b.eat();
		b.makeNoise();
		b.play();
		b.sleep();
		
		System.out.println("============================================================");
		
		
		Animal c = new Cat("kuta", "kutiya");
		
		Cat d = (Cat)c;
		  d.eat();
		  d.jump();
		  d.makeNoise();
		  d.sleep();
		
	}

}
