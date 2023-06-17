package com.firat.societies.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.firat.societies.core.dtoConverter.DtoconverterService;
import com.firat.societies.dto.DepartmentDto;
import com.firat.societies.dto.DepartmentRequestDto;
import com.firat.societies.model.Department;
import com.firat.societies.repository.DepartmentRepository;
import com.firat.societies.service.DepartmentService;

@Service
public class DepartmentImpl implements DepartmentService{

	private final DepartmentRepository departmentRepository;
	private final DtoconverterService dtoconverterService;

	public DepartmentImpl(DepartmentRepository departmentRepository, DtoconverterService dtoconverterService) {
		this.departmentRepository = departmentRepository;
		this.dtoconverterService = dtoconverterService;
	}

	@Override
	public Department add(DepartmentRequestDto department) {
		return departmentRepository.save((Department) dtoconverterService.dtoClassConverter(department, Department.class));
	}

	@Override
	public List<DepartmentDto> get() {
		return dtoconverterService.dtoConverter(departmentRepository.findAll(), DepartmentDto.class);
	}
}
