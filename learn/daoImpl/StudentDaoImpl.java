package com.learn.daoImpl;
import com.learn.dao.StudentDao;
import com.learn.pojo.Student;

public class StudentDaoImpl implements StudentDao{
	
	public int getValue(Student s)
	{
		System.out.println("Id = "+s.getId());
		System.out.println("Name = "+s.getName());
		System.out.println("Address = "+s.getAddress());
		System.out.println("Mobile = "+s.getMobile());
		System.out.println("Age = "+s.getAge());
		
		return s.getAge();
		
	}

}
