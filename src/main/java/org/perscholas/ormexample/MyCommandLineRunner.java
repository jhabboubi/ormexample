package org.perscholas.ormexample;

import java.time.LocalDate;
import java.util.Date;

import org.perscholas.ormexample.models.Department;
import org.perscholas.ormexample.models.Employee;
import org.perscholas.ormexample.service.DepartmentService;
import org.perscholas.ormexample.service.EmployeeSerivce;

public class MyCommandLineRunner {

	
	public static void addData() {
		
		EmployeeSerivce es = new EmployeeSerivce();
    	DepartmentService ds = new DepartmentService();
    	
    	
    	es.createOrUpateEmp(new Employee("jafer", LocalDate.of(2000, 1, 10),"password"));
    	es.createOrUpateEmp(new Employee("tim", LocalDate.of(2000, 2, 10),"password"));
    	es.createOrUpateEmp(new Employee("jenny", LocalDate.of(2000, 3, 10),"password"));
    	es.createOrUpateEmp(new Employee("elon", LocalDate.of(2000, 4, 10),"password"));
    	ds.createOrUpateDep(new Department(1, "IT"));
    	ds.createOrUpateDep(new Department(2, "Marketing"));
    	ds.createOrUpateDep(new Department(3, "Management"));
    	
	

    	es.addDepToEmp(1,1);
    	es.addDepToEmp(1,2);
    	es.addDepToEmp(2,3);
    	es.addDepToEmp(3,1);
    		
		
	}
	
}
