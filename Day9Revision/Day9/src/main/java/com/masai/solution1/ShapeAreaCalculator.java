package com.masai.solution1;

public class ShapeAreaCalculator {

	Circle circle;
	Rectangle rec;
	Square sq;
	
	public ShapeAreaCalculator(Circle circle,Rectangle rec,Square sq) {
		this.circle = circle;
		this.rec = rec;
		this.sq = sq;
	}
	
	public void calculate() {
		circle.area(5);
		rec.area(4, 5);
		sq.area(10);
	}
	
}
