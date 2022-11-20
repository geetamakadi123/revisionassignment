package com.masai.question2;

public class Implementaiton implements Interface, Interfacewo {

	

	public static void main(String[] args) {

		Implementaiton a1 = new Implementaiton();
		a1.first();
		a1.first(11,12);

	}

	@Override
	public void first(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(x+y);
	}

	@Override
	public void first() {
		// TODO Auto-generated method stub
		System.out.println("first impl");
		
		
	}

}
