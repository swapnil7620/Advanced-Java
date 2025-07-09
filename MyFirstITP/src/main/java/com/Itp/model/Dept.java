package com.Itp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Dept {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int dno;
	String dname;
	String city;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER) // where u don't required FK key
	@JoinColumn(name = "Fkdno",referencedColumnName = "dno")
	List<Employee> employees;
	
}
