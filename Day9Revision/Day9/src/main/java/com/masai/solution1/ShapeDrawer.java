package com.masai.solution1;

public class ShapeDrawer {

	Circle circle;
	Rectangle rec;
	Square sq;
	
	public ShapeDrawer(Circle circle,Rectangle rec,Square sq) {
		this.circle = circle;
		this.rec = rec;
		this.sq = sq;
	}
	
	public void shapeDraw() {
		
		circle.draw();
		rec.draw();
		sq.draw();
		
	}
	
}
