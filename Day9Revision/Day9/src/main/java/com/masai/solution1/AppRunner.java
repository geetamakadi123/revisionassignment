package com.masai.solution1;

public class AppRunner {

	 ShapeDrawer sd;
	 ShapeAreaCalculator sa;
	 
	 public AppRunner(ShapeDrawer sd,ShapeAreaCalculator sa) {
		 this.sd= sd;
		 this.sa = sa;
	 }
	 
	 public void run() {
		 sd.shapeDraw();
		 sa.calculate();
	 }
	
}
