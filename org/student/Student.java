package org.student;

import org.department.Department;

public class Student extends Department  {

	public void studentName() {
		
		System.out.println("student name : Gokila");
		
	}
	
	public void studentDept() {
		
		System.out.println("student department : EEE");
		
	}
	
	public void studentId() {
		
		System.out.println("student ID : 123");
		
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		s.studentDept();
		s.studentId();
		s.studentName();
			
				
	}
}
