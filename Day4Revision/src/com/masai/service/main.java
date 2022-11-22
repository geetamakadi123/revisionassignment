package com.masai.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import com.masai.bean.Address;
import com.masai.bean.Student;

public class main {
	
	 public static  void Myfunction(int one)
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 Service a = new ServiceImpl();
		 
		 List<Student> ccc = new ArrayList<>();
			
         Student chan = new Student();

        chan.setId(1);
        chan.setMarks(350);
        chan.setName("geeta");
        chan.setSection("a");
        chan.setAdd(new Address("chowk", "sahil", "12345"));

      Student str = new Student();

           str.setId(2);
            str.setMarks(220);
             str.setName("aata");
               str.setSection("b");
              str.setAdd(new Address("chowk", "sahil", "56789"));
              
                   ccc.add(chan);
                  	ccc.add(str);
		
		 
		 
		 
		 switch(one)
		 {
		 
		 case 1:  List<Student> c = new ArrayList<>();
			
		 
			
                          Student stu = new Student();
         
                                       stu.setId(1);
                                       stu.setMarks(240);
                                       stu.setName("abc");
                                      stu.setSection("a");
                                      stu.setAdd(new Address("gkp", "care", "1234"));
	
                                     Student stud = new Student();
         
                                          stud.setId(2);
                                           stud.setMarks(220);
                                            stud.setName("xyz");
                                              stud.setSection("b");
                                             stud.setAdd(new Address("gkp", "care", "5678"));
	
	
	                                              c.add(stu);
                                                 	c.add(stud);
		      
	                                         Student[] b = a.addStudent(c);
	                                                for(Student s:b)
	                                                  {
	                                                    	System.out.println(s);
	                                                            }
	     break;
		 case 2:   List<Student> cc = new ArrayList<>();
			
		 
			
                       Student stuq = new Student();

                      stuq.setId(1);
                      stuq.setMarks(240);
                      stuq.setName("abc");
                     stuq.setSection("a");
                     stuq.setAdd(new Address("gkp", "care", "1234"));

                    Student stue = new Student();

                         stue.setId(2);
                          stue.setMarks(220);
                           stue.setName("xyz");
                             stue.setSection("b");
                            stue.setAdd(new Address("gkp", "care", "5678"));


                                 cc.add(stuq);
                                	cc.add(stue);
                               System.out.println("Enter the Student Id To Delete");
                              
                               int id = sc.nextInt();
                            List<Student> be = a.deleteStudent(cc, id);
                                   for(Student s:be)
                                     {
                                       	System.out.println(s);
                                               }
            break;
		 case  3:   List<Student> cd = new ArrayList<>();
			
		 
			
         Student stues = new Student();

                      stues.setId(1);
                      stues.setMarks(240);
                      stues.setName("abc");
                     stues.setSection("a");
                     stues.setAdd(new Address("gkp", "care", "1234"));

                    Student st = new Student();

                         st.setId(2);
                          st.setMarks(220);
                           st.setName("xyz");
                             st.setSection("b");
                            st.setAdd(new Address("gkp", "care", "5678"));


                                 cd.add(stues);
                                	cd.add(st);
                                    int ide = sc.nextInt();
                                   Student  bf  =   a.findStudent(cd, ide);
                                   
                                     
                                       	System.out.println(bf);
                                               
break;
           





		 case 4:        System.out.println("Pleas Enter the Pincode");
		                 String s  = sc.next();
			             Collection<Student> sol = a.findStudentWithPincode(ccc, s);
			             for(Student ip:sol)
			             {
			            	 System.out.println(ip);
			             }
		   break;
		   
		 case 5 : Collection<Student> aa = a.sortWithName(ccc);
		 
		            for(Student ti:aa)
		            {
		            	System.out.println(ti);
		            }
		            break;
		 case 6: Collection<Student> ca = a.setOfMarks(ccc);
		 
		           for(Student lit:ca)
		           {
		        	   System.out.println(lit);
		           }
		           
		 case 7: 
			 Collection<Student> asi = new ArrayList<>();
		      
		      
	         Student stu1 = new Student();
	        
	        stu1.setId(1);
	        stu1.setMarks(240);
	        stu1.setName("abc");
	        stu1.setSection("a");
	        stu1.setAdd(new Address("gkp", "care", "1234"));
		
	     Student sit = new Student();
	        
	        sit.setId(2);
	        sit.setMarks(220);
	        sit.setName("xyz");
	        sit.setSection("b");
	        sit.setAdd(new Address("gkp", "care", "5678"));
		      
		      asi.add(stu1);
		      asi.add(sit);
			
			
			
			Collection<Student> annswer = a.addAllStudents(asi);
			
			for(Student ctc:annswer)
			{
				System.out.println(ctc);
			}
			break;
			default:
				System.out.println("Something went wrong");
			 
			 
			 
			 
			 
			 
		 }
		 
		 
		 
		 
		 
		 
	 }
	
	       
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		Scanner r = new Scanner(System.in);
		

		
		System.out.println("");

		System.out.println("   WelCome to Mini Java Application    ");
		
		
		System.out.println("");
		
		
		System.out.println("    Press 1 for Add Studnet");
		System.out.println("    Press 2 for Delete Student ");
		System.out.println("    Press 3 for find Studnet ");
		System.out.println("    Press 4 for find Student with Pincode");
		System.out.println("    Press 5 for Sort STudent with name");
		System.out.println("    Press 6 fro short Studnet with marks");
		System.out.println("    Press 7 for Add Studnets and WE Students");

		


		
		
	           int s = Integer.parseInt(r.next());		
		
		  if(s==1)
		  {
			  Myfunction(1);
		  }
		  else if(s==2)
		  {
			  Myfunction(2);
		  }
		  else if(s==3)
		  {
			  Myfunction(3);
		  }
		  else if(s==4)
		  {
			  Myfunction(4);
		  }
		  else if(s==5)
		  {
			  Myfunction(5);
		  }
		  else if(s==6)
		  {
			  Myfunction(6);
		  }
		  else if(s==7)
		  {
			  Myfunction(7);
		  }
		  else
		  {
			  System.out.println("Pleas Enter corret Number");
		  }
		
		
	}
}
		

