package com.masai.solution2;

public class Square implements Shapes{

    public void area(int a) {
		
		System.out.println("area of square is "+a*a);
		
	}
	
	public void perimeter(int a) {
		
		System.out.println("perimeter of the square is "+ 4*a);
	}
	
	public void draw() {
		System.out.println("I am drawing square");
	}
	
}
