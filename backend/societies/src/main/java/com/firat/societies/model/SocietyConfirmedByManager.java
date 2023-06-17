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
@Table(name = "society_confirmed_by_manager")
public class SocietyConfirmedByManager {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne()
	private SocietyManager societyManager;
	
	@ManyToOne()
	private Student student;
	
	@Column(columnDefinition = "date")
	private LocalDate confirmDate = LocalDate.now();
	
	@Column(columnDefinition = "boolean")
	private boolean isConfirmed;
}
