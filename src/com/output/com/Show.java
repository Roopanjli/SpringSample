package com.output.com;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.student.com.Student;
public class Show {
public static void main(String[] args) {
	Configuration c=new Configuration();
	c.configure("hibernate.cfg.xml");	
	SessionFactory sf=c.buildSessionFactory();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	Student st=new Student();
	st.setClub("Drawing");
	st.setName("Raju");
	st.setRollNo(12345);
	s.save(st);
	t.commit();
	s.close();
	System.out.println("Successfully recorded");
	
	
}
}
