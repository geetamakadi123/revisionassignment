package com.masai.solution3;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.masai.RevSpringApplication;

public class Main {

	public static void main(String[] args) {
		

		
		ConfigurableApplicationContext context =  SpringApplication.run(RevSpringApplication.class, args);
		
		AppRunner ar =  context.getBean(AppRunner.class);
		
		ar.run();
		
	}
	
}
