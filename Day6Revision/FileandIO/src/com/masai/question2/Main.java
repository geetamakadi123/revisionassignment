package com.masai.que2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file= new File("D:\\Input\\komal.txt");
		 FileReader r=new FileReader(file);
		 
		 char[] ch = new char[(int) file.length()];

			r.read(ch);

			String cha = String.valueOf(ch);
			System.out.println(cha);

	}

}
