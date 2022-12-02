package com.masai.solution2;

public class ShapeDrawer {

	Shapes shape;
	
	public ShapeDrawer(Shapes shape) {
		this.shape = shape;
	}
	
	public void shapeDraw() {
		
		shape.draw();
		
	}
	
}
