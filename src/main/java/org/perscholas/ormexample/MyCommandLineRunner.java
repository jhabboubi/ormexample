package org.perscholas.ormexample;

import java.util.Date;

import org.perscholas.ormexample.models.Department;
import org.perscholas.ormexample.models.Employee;
import org.perscholas.ormexample.service.DepartmentService;
import org.perscholas.ormexample.service.EmployeeSerivce;

public class MyCommandLineRunner {

	
	public static void addData() {
		
		EmployeeSerivce es = new EmployeeSerivce();
    	DepartmentService ds = new DepartmentService();
    	
    	
    	es.createOrUpateEmp(new Employee("jafer", new Date(),"password"));
    	es.createOrUpateEmp(new Employee("tim", new Date(),"password"));
    	es.createOrUpateEmp(new Employee("jenny", new Date(),"password"));
    	es.createOrUpateEmp(new Employee("elon", new Date(),"password"));
    	ds.createOrUpateDep(new Department(1, "IT"));
    	ds.createOrUpateDep(new Department(2, "Marketing"));
    	ds.createOrUpateDep(new Department(3, "Management"));
    	
	

    	es.addDepToEmp(1,1);
    	es.addDepToEmp(1,2);
    	es.addDepToEmp(2,3);
    	es.addDepToEmp(3,1);
    		
		
	}
	
}
