package com.masai.que3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("");
		
		
		if(f.mkdir())
		{
			 File c = new File("newFile.txt");
		      try {
				FileWriter e = new FileWriter(c);
				
				
				 e.write("Java Proggraming is the best languae");
				 e.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      
		}
		else
		{
			System.out.println("To the end");
		}
		      
		}
		
		

	}


