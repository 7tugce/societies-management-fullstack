package com.firat.societies.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "socity_applications")
public class SocietiesApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(columnDefinition = "date")
	private LocalDate applicationDate = LocalDate.now();
	
	@Column(columnDefinition = "boolean")
	private boolean isActive = true;
	
	@ManyToOne()
	Student student;
	
	@ManyToOne()
	private Society society;
}
