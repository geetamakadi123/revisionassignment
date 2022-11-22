package com.masai.service;

import java.util.Collection;
import java.util.List;

import com.masai.bean.Student;

public interface Service {
	
	public Student[] addStudent(List<Student> stud);
	public List<Student> deleteStudent(List<Student> stud ,int id);
	public Student findStudent(List<Student> stud,int id);
	
	public Collection<Student> findStudentWithPincode(List<Student> sa,String pincode);
	public Collection<Student>sortWithName(List<Student> as);
	public Collection<Student>setOfMarks(List<Student> ass);
	public Collection<Student>addAllStudents(Collection<Student> stud);
}
