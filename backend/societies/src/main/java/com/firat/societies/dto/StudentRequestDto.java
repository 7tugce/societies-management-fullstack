package com.firat.societies.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequestDto {

	private int id;
	private String firstName;
	private String lastName;
	private String studentNum;
	private String password;
	private String email;
	private int facultyId;
	private int departmentId;
	private int degreeId;
	private int gradeId;
}
