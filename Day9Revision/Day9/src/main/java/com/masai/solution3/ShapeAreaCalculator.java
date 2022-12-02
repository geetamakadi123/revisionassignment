package com.masai.solution3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShapeAreaCalculator {

	Shapes shape;
	
	@Autowired
	public ShapeAreaCalculator(Shapes shape) {
		this.shape = shape;
	}
	
	public void calculate() {
		shape.area(5);
	}
	
}
