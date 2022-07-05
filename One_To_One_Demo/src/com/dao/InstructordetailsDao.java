package com.dao;

import com.entity.Instructor_details;

public interface InstructordetailsDao {
     
	void saveInstructorDetail(Instructor_details ins);
	 void updateInstructorDetail(Instructor_details ins);
	 Instructor_details getInstructorbyId(long id);
}
