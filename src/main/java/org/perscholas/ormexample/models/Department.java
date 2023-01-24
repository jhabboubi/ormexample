package org.perscholas.ormexample.models;

<<<<<<< HEAD
import java.util.LinkedList;
=======
import java.util.ArrayList;
>>>>>>> 3fbc0cf9150e3e3c3b25ead8f82c9557841fb6bd
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Department {
	
	@Id
	@NonNull
	int id;
	@NonNull
	String name;
<<<<<<< HEAD
	
	@ToString.Exclude
	@ManyToMany(mappedBy = "dep", cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	List<Employee> emp = new LinkedList<>();
=======
	@ToString.Exclude
	@ManyToMany(mappedBy = "dep", cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	List<Employee> emp = new ArrayList<>();

>>>>>>> 3fbc0cf9150e3e3c3b25ead8f82c9557841fb6bd
}
