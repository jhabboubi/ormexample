package org.perscholas.ormexample;

import java.util.Date;

import org.hibernate.Session;
import org.perscholas.ormexample.models.Department;
import org.perscholas.ormexample.models.Employee;
import org.perscholas.ormexample.service.DepartmentService;
import org.perscholas.ormexample.service.EmployeeSerivce;

/**
 * Hello world!
 *
 */
public class App {
	
	
	
    public static void main( String[] args ){
    	
    	
    	HibernateUtil.connection();
    	
    	MyCommandLineRunner.addData();
    	
    	
    	
    
<<<<<<< HEAD
    	
=======
    	Transaction tx = null;
    	Session session = factory.openSession();
    	try{
    		
    		tx = session.beginTransaction();
    		// transient mode
    		Employee e = new Employee("jafer", new Date(),"password");
    		Employee e2 = new Employee("tim", new Date(),"password");
    		Department d = new Department(1,"marketing");
    		Department d2 = new Department(2,"IT");

    		// persist mode
    		session.persist(d);
    		session.persist(d2);
    		session.persist(e);
    		session.persist(e2);
    		
    		
    		
    		tx.commit();
    		System.out.println("-----");
    		System.out.println(tx.getStatus());
    		System.out.println("-----");

    		tx = session.beginTransaction();
    		e.addDepartment(d2);
    		session.merge(e);
    		tx.commit();
    		System.out.println("-----");
    		System.out.println(tx.getStatus());
    		System.out.println("-----");
    		List<Object[]> obj = session.createQuery("select name from Employee", Object[].class).getResultList();
    		
    		
    		List<Employee> list = session.createQuery("from Employee", Employee.class)
    				.getResultList();
    		
    		
    		Query<Employee> q = session
    				.createQuery("from Employee where id = :userId", Employee.class)
    				.setParameter("userId", 1001);
    		List<Employee> eeee = q.getResultList();
>>>>>>> 3fbc0cf9150e3e3c3b25ead8f82c9557841fb6bd
    		
    		
    		
    		
//    		
//    		
//    		Query<Employee> q = session
//    				.createQuery("from Employee where id = :userId", Employee.class)
//    				.setParameter("userId", 1001);
//    		List<Employee> eeee = q.getResultList();
//    		
//    		
//    		
//    		System.out.println(list);
//    		// detached mode 
//    		Employee e3 =session.createNamedQuery("getById", Employee.class)
//    				.setParameter("id", 1)
//    				.getSingleResult();
//    		System.out.println(e3);
    		
    		
    		
    	
    		
       		
    		
    		
    		
    
    	
    	
        
    }
}
