package org.perscholas.ormexample.models;

<<<<<<< HEAD
import java.time.LocalDate;
=======
import java.util.ArrayList;
>>>>>>> 3fbc0cf9150e3e3c3b25ead8f82c9557841fb6bd
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@NamedQueries({
	@NamedQuery(name = "getAll", query = "from Employee"),
	@NamedQuery(name = "getById", query = "from Employee where id = :id")
})


public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@NonNull
	@Column(columnDefinition = "varchar(50)")
	String name;
	@NonNull
	LocalDate dob;
	@NonNull
	String password;
	
	@ToString.Exclude
<<<<<<< HEAD
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH},
			fetch = FetchType.EAGER)
	
	@JoinTable(name="emp_dep_jointable",
	joinColumns = @JoinColumn(name="emp_id"),
	inverseJoinColumns = @JoinColumn(name="dep_id"))
	List<Department> dep = new LinkedList<Department>();
=======
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.REMOVE,CascadeType.DETACH},
			fetch = FetchType.EAGER)
	@JoinTable(name = "emp_dep_jointable",
	joinColumns = @JoinColumn(name="employee_id"),
	inverseJoinColumns = @JoinColumn(name="department_id"))
	List<Department> dep = new ArrayList<>();
	
>>>>>>> 3fbc0cf9150e3e3c3b25ead8f82c9557841fb6bd
	
	public void addDepartment(Department d) {
		dep.add(d);
		d.getEmp().add(this);
<<<<<<< HEAD
		
	}

	public Employee(int id, @NonNull String name, @NonNull LocalDate dob, @NonNull String password) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.password = password;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dob, other.dob) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dob, id, name, password);
	}


=======
			
	}
>>>>>>> 3fbc0cf9150e3e3c3b25ead8f82c9557841fb6bd

	
}

