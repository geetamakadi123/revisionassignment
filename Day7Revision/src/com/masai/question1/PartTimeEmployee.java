package com.masai.question1;

import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class PartTimeEmployee {
	
	private int salaryPerHour;
	private String consultantCode;
	
	private void writeObject(ObjectOutputStream objectOutputStream) throws NotSerializableException {
		
		throw new NotSerializableException();
	
	}

}
