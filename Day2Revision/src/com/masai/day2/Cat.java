package com.masai.day2;

public class Cat  extends Animal{

	
	String nickname;
	
	public Cat(String name, String nickname) {
		super(name);
		
		this.nickname = nickname;
	}

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	
	void jump()
	{
		System.out.println(nickname + " Cat is Juming");
	}
	
	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Cat is makingnose!");
		
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat is Eating!");
	}

	
	
}
