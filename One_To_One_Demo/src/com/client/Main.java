package com.client;

import com.daoImp.Instructor_daoImp;
import com.entity.Instructor;
import com.entity.Instructor_details;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor("Ram","Kumar","ram@gmail.com");
		Instructor_details instrpuctordetails = new Instructor_details("www.youtube.com","education");
		
		instructor.setInstructorDetails(instrpuctordetails);
        Instructor_daoImp s = new Instructor_daoImp();
		s.saveInstructor(instructor);
		System.out.println("done");
	

	}

}

