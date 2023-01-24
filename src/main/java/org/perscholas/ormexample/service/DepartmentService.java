package org.perscholas.ormexample.service;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.perscholas.ormexample.HibernateUtil;
import org.perscholas.ormexample.models.Department;
import org.perscholas.ormexample.models.Employee;

public class DepartmentService {
	
	
	public void createOrUpateDep(Department d) {

	Transaction tx = null;
	Session session = HibernateUtil.factory.openSession();
	try {

		tx = session.beginTransaction();
		session.merge(d);
		tx.commit();

	} catch(
	HibernateException ex){
		ex.printStackTrace();
		tx.rollback();
	}finally {
		session.close();
	}
}
	
	
	
}


