package org.perscholas.ormexample.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Department {
	
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
    @NonNull
    String deptName;
    @OneToMany
    List<Employee>  emp;
	
	
	
}
