package com.masai.solution2;

public class Circle implements Shapes {
	
	public void area(int radius) {
		
		System.out.println("radius of circle is"+3.14*radius*radius);
		
	}
	
	public void perimeter(int radius) {
		
		System.out.println("perimeter of the circle is "+ 2*3.14*radius);
	}
	
	public void draw() {
		System.out.println("I am drawing cicle");
	}

}
