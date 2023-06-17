package com.firat.societies.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocietiesApplicationDto {

	private int id;
	private String studentFirstName;
	private String studentLastName;
	private String studentFacultyName;
	private String studentDepartmentName;
	private String studentDegreeName;
	private String studentGradeName;
	private String societySocietyName;
	private String societySocietyNameAbbreviation;
	
}
