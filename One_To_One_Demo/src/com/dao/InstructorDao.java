package com.dao;

import com.entity.Instructor;

public interface InstructorDao {
      
	 void saveInstructor(Instructor ins);
	 void updateInstructor(Instructor ins);
	 void deleteInstructor(long id);
	 Instructor getInstructorbyId(long id);
}
