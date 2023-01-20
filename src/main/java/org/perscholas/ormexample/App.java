package org.perscholas.ormexample;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.perscholas.ormexample.models.Department;
import org.perscholas.ormexample.models.Employee;

/**
 * Hello world!
 *
 */
public class App {

	private static ServiceRegistry registry;
	private static SessionFactory factory;

	public static void main(String[] args) {

		try {

			// configuration
			Configuration conf = new Configuration()
					.configure(new File("src/main/java/org/perscholas/ormexample/hibernate.cfg.xml"));
			conf.addAnnotatedClass(Employee.class);
			conf.addAnnotatedClass(Department.class);
			// registry
			registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();

			factory = conf.buildSessionFactory(registry);

		} catch (Throwable ex) {
			ex.printStackTrace();
		}

		Transaction tx = null;
		Session session = factory.openSession();
		try {

			tx = session.beginTransaction();
			// transient mode
			Employee e = new Employee("jafer", new Date(), "password");
			Employee e2 = new Employee("jafer", new Date(), "password");

			// persist mode
			session.persist(e);
			session.persist(e2);
			

			tx.commit();
		} catch (HibernateException ex) {

			ex.printStackTrace();
			tx.rollback();

		} finally {
			session.close();

		}
		Session session1 = factory.openSession();
		try {

			tx = session1.beginTransaction();
			// transient mode
            Department d = new Department("MATH");
            Department d1= new Department("SOCIAL");

			// persist mode
			session1.persist(d);
			session1.persist(d1);
			

			tx.commit();
		} catch (HibernateException ex) {

			ex.printStackTrace();
			tx.rollback();

		} finally {
			session1.close();

		}

		Session session2 = factory.openSession();
			try {
			List<Employee> list = session2.createNamedQuery("getAll", Employee.class).getResultList();
			System.out.println(list);
			// detached mode
			
			Employee e1 = session2.createNamedQuery("getById",Employee.class).setParameter("id",1).getSingleResult();
			System.out.println(e1);
			
			Object obj = session2.createNamedQuery("getName", Object.class).setParameter("id",1).getSingleResult();
            System.out.println((String)obj);
            
            
            
            
            
		} catch (HibernateException ex) {

			ex.printStackTrace();
			tx.rollback();

		} finally {
			session2.close();

		}
		

	}
}
