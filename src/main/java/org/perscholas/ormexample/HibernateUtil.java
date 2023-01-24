package org.perscholas.ormexample;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.perscholas.ormexample.models.Department;
import org.perscholas.ormexample.models.Employee;

public class HibernateUtil {
	
	public static ServiceRegistry registry;
	public static SessionFactory factory;
	
	public static void connection() {
try {
    		
    		// configuration comment
    			Configuration conf = new Configuration().
    					configure(new File
    							("src/main/java/org/perscholas/ormexample/hibernate.cfg.xml"));
    		conf.addAnnotatedClass(Employee.class);
    		conf.addAnnotatedClass(Department.class);
    		// registry
    		registry = new StandardServiceRegistryBuilder()
    				.applySettings(conf.getProperties())
    				.build();
    		
    		factory = conf.buildSessionFactory(registry);
    		
    	} catch (Throwable ex) {
    		ex.printStackTrace();
    	}
	}

}
