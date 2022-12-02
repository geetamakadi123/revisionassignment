package com.masai.solution3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppRunner {

	 ShapeDrawer sd;
	 ShapeAreaCalculator sa;
	 
	 @Autowired
	 public AppRunner(ShapeDrawer sd,ShapeAreaCalculator sa) {
		 this.sd= sd;
		 this.sa = sa;
	 }
	 
	 public void run() {
		 sd.shapeDraw();
		 sa.calculate();
	 }
	
}
