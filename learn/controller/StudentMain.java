package com.learn.controller;

import java.util.HashSet;

class Student
{
	int id;
	String name;
	Student(int i,String s)
	{
		id=i;
		name=s;
	}
	@Override
	public String toString() {
	
		return this.id+" "+this.name;
	}
	@Override
	public int hashCode() {
		
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
	
		Student ss=(Student)obj;
		if(this.id==ss.id)
		{
			System.out.println("kkkk");
			return true;
		}
		
		return false;
		
	}
}
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student s1=new Student(10,"salman");
		Student s2=new Student(12,"salman");
		Student s3=new Student(101,"Farhan");
				
		
		HashSet<Student> hs=new HashSet<Student>();
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(hs);
		
		

}
}