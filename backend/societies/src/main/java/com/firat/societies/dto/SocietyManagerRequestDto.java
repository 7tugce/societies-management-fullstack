package com.firat.societies.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocietyManagerRequestDto {

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
	private String phone;
	//private int societyId;
}
