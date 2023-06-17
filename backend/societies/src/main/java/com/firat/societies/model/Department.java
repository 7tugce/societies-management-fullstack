package com.firat.societies.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "departments")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "department")
	private String name;
	
	@JsonIgnoreProperties("departments")
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "faculties_departments", 
	joinColumns = @JoinColumn(name = "department_id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "faculty_id", referencedColumnName = "id"))
	private List<Faculty>faculties;
	
	@ManyToOne()
	@JoinColumn(name = "degree_id")
	Degree degree;
}
