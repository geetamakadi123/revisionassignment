package com.masai.solution1;

public class Main {

	public static void main(String[] args) {
		
		ShapeDrawer sd = new ShapeDrawer(new Circle(),new Rectangle(),new Square());
		
		ShapeAreaCalculator sa = new ShapeAreaCalculator(new Circle(),new Rectangle(),new Square());
		
		AppRunner ar = new AppRunner(sd, sa);
		
		ar.run();
		
	}
	
}
