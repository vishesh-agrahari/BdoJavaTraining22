package com.daoImp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dao.InstructorDao;
import com.entity.Instructor;
import com.util.HibernateUtil;

public class Instructor_daoImp implements InstructorDao{

	static Session session = null;
	static Transaction trans = null;
	static SessionFactory sessionfactory = null;
	@Override
	public void saveInstructor(Instructor instructor) {
		session = HibernateUtil.getSessionFactory().openSession();// obtain the session for insert operations
		trans = session.beginTransaction();
		session.save(instructor);// this equivalent to "insert into table value()
		trans.commit();
		session.close();
		
	}

	@Override
	public void updateInstructor(Instructor ins) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInstructor(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Instructor getInstructorbyId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
