package com.firat.societies.service;

import java.util.List;

import com.firat.societies.dto.DepartmentDto;
import com.firat.societies.dto.DepartmentRequestDto;
import com.firat.societies.model.Department;

public interface DepartmentService {

	Department add(DepartmentRequestDto department);
	List<DepartmentDto>get();
}
