package org.perscholas.ormexample.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.perscholas.ormexample.HibernateUtil;
import org.perscholas.ormexample.MyCommandLineRunner;
import org.perscholas.ormexample.models.Employee;

class EmployeeSerivceTest {

	static EmployeeSerivce es = null;
	static Employee e = null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		HibernateUtil.connection();
		MyCommandLineRunner.addData();
		e = new Employee(1,"jafer", LocalDate.of(2000, 1, 10),"password");
		es = new EmployeeSerivce();

	//comment	

	}
	
	@BeforeEach
	void testingTwo() {
		System.out.println("--------");
	}
	@AfterEach
	void testingTwod() {
		System.out.println("++++++++");
	}

	@Test @DisplayName("tesing id only")
	void test() {
		
		//fail("Not yet implemented");
		assertThat(e.getId()).isEqualTo(es.getEmployeeById(1).getId()); // assertJ
		
		
	}
	
	@Test @DisplayName("full obj testing")
	void testing() {
		//fail("Not yet implemented");

		assertThat(e).isEqualTo(es.getEmployeeById(1)); // assertJ
		
	}
	
	@Test
	void testFour() {
		assertThrows(NumberFormatException.class, () -> {
			Integer.parseInt("Five");
			});
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,2,3,4})
	void param(int i) {
		assertThat(es.getEmployeeById(i)).isNotNull();  // assertj
		assertNotNull(es.getEmployeeById(i));			// junit
	}
	
	

}
