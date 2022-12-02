package com.masai.solution3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShapeDrawer {

	Shapes shape;
	
	@Autowired
	public ShapeDrawer(Shapes shape) {
		this.shape = shape;
	}
	
	public void shapeDraw() {
		
		shape.draw();
		
	}
	
}
