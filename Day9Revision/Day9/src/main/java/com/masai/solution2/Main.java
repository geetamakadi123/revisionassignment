package com.masai.solution2;

public class Main {

	public static void main(String[] args) {
		
		Shapes shape = new Circle();
		
		ShapeDrawer sd = new ShapeDrawer(shape);
		
		ShapeAreaCalculator sa = new ShapeAreaCalculator(shape);
		
		AppRunner ar = new AppRunner(sd, sa);
		
		ar.run();
		
	}
	
}
