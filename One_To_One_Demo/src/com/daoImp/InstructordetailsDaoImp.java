package com.daoImp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dao.InstructordetailsDao;
import com.entity.Instructor_details;
import com.util.HibernateUtil;

public class InstructordetailsDaoImp implements InstructordetailsDao {
	
	static Session session = null;
	static Transaction trans = null;
	static SessionFactory sessionfactory = null;

	@Override
	public void saveInstructorDetail(Instructor_details instructordetail) {
		session = HibernateUtil.getSessionFactory().openSession();// obtain the session for insert operations
		trans = session.beginTransaction();
		session.save(instructordetail);// this equivalent to "insert into table value()
		System.out.println("inserted Successfully");
		trans.commit();
		session.close();
		
	}

	@Override
	public void updateInstructorDetail(Instructor_details ins) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Instructor_details getInstructorbyId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
