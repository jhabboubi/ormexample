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
