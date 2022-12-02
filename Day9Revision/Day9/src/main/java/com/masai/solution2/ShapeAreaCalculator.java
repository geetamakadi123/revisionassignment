package com.masai.solution2;

public class ShapeAreaCalculator {

	Shapes shape;
	
	public ShapeAreaCalculator(Shapes shape) {
		this.shape = shape;
	}
	
	public void calculate() {
		shape.area(5);
	}
	
}
