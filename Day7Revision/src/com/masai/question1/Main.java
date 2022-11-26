package com.masai.question1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

public class Main {

	public static void main(String[] args) {
		
		List<Student> collectionOfStudent = new ArrayList<>();
		
		collectionOfStudent.add(new Student(12, "Pallavi", 20, 20));
		collectionOfStudent.add(new Student(13, "komal", 22, 21));
		collectionOfStudent.add(new Student(14, "Pranay", 23, 22));
		collectionOfStudent.add(new Student(15, "nia", 24, 23));
		collectionOfStudent.add(new Student(16, "Ram", 25, 24));
		
		List<Employee> collectionOfEmployees = new ArrayList<>();
		
		collectionOfEmployees.add(new Employee(12, "Pallavi", 20, 120000, "Wardha"));
		collectionOfEmployees.add(new Employee(13, "Akash", 22, 140000, "Mumbai"));
		collectionOfEmployees.add(new Employee(14, "shalu", 24, 150000, "Pune"));
		
		try {
			
			FileOutputStream fileOutputStream = new FileOutputStream("object.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(collectionOfStudent);
			objectOutputStream.writeObject(collectionOfEmployees);
			
			objectOutputStream.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch(IOException ioException) {
			
			ioException.printStackTrace();
		}
		
		
		
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream("object.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Object obj = objectInputStream.readObject();
			
			List<Student> listOfStudent = (List<Student>) obj;
//			List<Employee> listEmployees = (List<Employee>)obj;
			
			System.out.println(listOfStudent);
//			System.out.println(listEmployees);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}catch(IOException ioException) {
			
			ioException.printStackTrace();
			
		}catch(ClassNotFoundException classNotFoundException) {
			
			classNotFoundException.printStackTrace();
			
		}
		
		

	}

}
