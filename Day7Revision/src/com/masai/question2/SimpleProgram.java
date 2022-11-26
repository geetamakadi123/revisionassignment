package com.masai.question2;

import java.util.Scanner;

public class SimpleProgram {
	
	public static void main(String...args){
		
		Scanner scanner = null;
		
		try {
			
		    scanner = new Scanner(System.in);
			//some statements throwing SomeSeriousProblemOccuredException;
		    
		    System.out.println("Please enter string greater then 3");
		    String string = scanner.next();
		    
		    if(string.length() <= 3) {
		    	
		    	throw new SomeSeriousProblemOccuredException("Length should be greater than three");
		    }
		    
		    System.out.println("Your input string is " + string);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
			
			scanner.close();
			
		}
		
		
		
		
		
}


}
