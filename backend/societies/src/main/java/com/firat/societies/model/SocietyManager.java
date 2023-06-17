package com.firat.societies.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_society_manager")
@PrimaryKeyJoinColumn(name = "id")
public class SocietyManager extends User{

	@Column(name = "phone")
	private String phone;
	
	@ManyToOne()
	@JoinColumn(name = "society_id")
	private Society society;
}
