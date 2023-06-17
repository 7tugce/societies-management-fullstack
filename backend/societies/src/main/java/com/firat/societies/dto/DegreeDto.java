package com.firat.societies.dto;

import java.util.List;

import com.firat.societies.model.Department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DegreeDto {

	private int id;
	private String name;
	//private List<Department>departments;
}
