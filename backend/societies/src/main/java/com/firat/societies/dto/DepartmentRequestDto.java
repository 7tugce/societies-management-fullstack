package com.firat.societies.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentRequestDto {

	private int id;
	private String name; 
	private int facultyId;
	private int degreeId;
}
