package com.masai.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.masai.bean.Address;
import com.masai.bean.Student;

public class ServiceImpl implements Service{

	@Override
	public Student[] addStudent(List<Student> stud) {
		// TODO Auto-generated method stub
		
		Student [] a = new Student[stud.size()];
		
		
		for(int i=0; i<stud.size(); i++)
		{
			a[i] = stud.get(i);
		}
		
		return a;
	}

	@Override
	public List<Student> deleteStudent(List<Student> stud,int id) {
		// TODO Auto-generated method stub
		
               Student[] a = new Student[stud.size()];
               Student s = new Student();
               
               List<Student> aa= new ArrayList<>();
              
               
               for(Student ss:stud)
               {
            	   if(ss.getId()==id)
            	   {
            		   stud.remove(aa);
            	   }
            	   else
            	   {
            		   aa.add(ss);
            	   }
               }
                 
              
               
		
		return aa;
	}

	@Override
	public Student findStudent(List<Student> stud,int id) {
		// TODO Auto-generated method stub
		
		     Student ss= null;
		
		  for(Student s :stud)
		  {
			  if(s.getId()==id)
			  {
				   ss = s;
				   break;
			  }
		  }
		
		 
		return ss;
	}

	@Override
	public Collection<Student> findStudentWithPincode(List<Student> sa,String pincode) {
		// TODO Auto-generated method stub
		
		  Collection<Student> a = new ArrayList<>();
		  
		  for(Student s:sa)
		  {
			  if(s.getAdd().getPincode()==pincode)
			  {
				  a.add(s);
			  }
		  }
		  
		  
		return a;
	}
 
	@Override
	public Collection<Student> sortWithName(List<Student>as) {
		// TODO Auto-generated method stub
		
		  Collections.sort(as,(ps1,ps2)-> ps1.getName().compareTo(ps2.getName()));
		
		  Collection<Student> s = new ArrayList<>();
		  
		 
		  for(Student ss: as)
		  {
			  s.add(ss);
		  }
		
		
		return s;
	}

	@Override
	public Collection<Student> setOfMarks(List<Student> ass) {
		// TODO Auto-generated method stub
		
		 
		List<Student> s= ass.stream().sorted(Comparator.comparingInt(Student::getMarks)).collect(Collectors.toList());
		
		Collection<Student> ans = new ArrayList<>();
		for(Student c:s)
		{
			ans.add(c);
		}
		
		return ans;
	}

	@Override
	public Collection<Student> addAllStudents(Collection<Student> stud) {
		// TODO Auto-generated method stub
		
		      Collection<Student> as = new ArrayList<>();
		      
		      
               Student stu = new Student();
              
              stu.setId(1);
              stu.setMarks(240);
              stu.setName("auakrsh");
              stu.setSection("a");
              stu.setAdd(new Address("gkp", "care", "1234"));
		
           Student st = new Student();
              
              st.setId(2);
              st.setMarks(220);
              st.setName("bumedh");
              st.setSection("b");
              st.setAdd(new Address("gkp", "care", "5678"));
		      
		      as.add(st);
		      as.add(stu);
		      
		      for(Student s:stud)
		      {
		    	  as.add(s);
		      }
		      
		      
		      
		      
		      
		
		return as;
	}
	
	

}
