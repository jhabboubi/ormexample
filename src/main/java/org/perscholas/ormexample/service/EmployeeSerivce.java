package org.perscholas.ormexample.service;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.perscholas.ormexample.HibernateUtil;
import org.perscholas.ormexample.models.Department;
import org.perscholas.ormexample.models.Employee;

public class EmployeeSerivce {
	
	
	public void createOrUpateEmp(Employee e) {

	Transaction tx = null;
	Session session = HibernateUtil.factory.openSession();
	try {

		tx = session.beginTransaction();
		session.merge(e);
		tx.commit();

	} catch(
	HibernateException ex){
		ex.printStackTrace();
		tx.rollback();
	}finally {
		session.close();
	}
}
	
	public void addDepToEmp(int empId, int depId) {
		
		Transaction tx = null;
		Session session = HibernateUtil.factory.openSession();
		try {
			Employee e = session.get(Employee.class, empId);
			Department d = session.get(Department.class, depId);
			tx = session.beginTransaction();
			e.addDepartment(d);
			session.merge(e);
			tx.commit();

		} catch(
		HibernateException ex){
			ex.printStackTrace();
			tx.rollback();
		}finally {
			session.close();
		}
		
	}
	
	
	public Employee getEmployeeById(int id) {
		
		Transaction tx = null;
		Employee e = null;
		Session session = HibernateUtil.factory.openSession();
		try {
		 e = session.get(Employee.class, id);
		
		} catch(
		HibernateException ex){
			ex.printStackTrace();
			
			
		}finally {
			session.close();
		}
		
		return e;
		
	}
	
	
	
}


