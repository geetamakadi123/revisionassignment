package com.masai.solution3;

public class Rectangle implements Shapes{

		@Override
		public void area(int side) {
			System.out.println("area of rectangle is "+(side*side));
			
		}

		@Override
		public void perimeter(int side) {
			System.out.println("perimeter of the rectangle is "+ (4*side));
			
		}

		@Override
		public void draw() {
			System.out.println("I am drawing rectangle");
			
		}
	
}
