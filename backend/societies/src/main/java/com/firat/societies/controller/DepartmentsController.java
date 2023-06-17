package com.firat.societies.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firat.societies.dto.DepartmentDto;
import com.firat.societies.dto.DepartmentRequestDto;
import com.firat.societies.model.Department;
import com.firat.societies.service.DepartmentService;

@RestController
@RequestMapping("/api/departments")
@CrossOrigin
public class DepartmentsController {

	private final DepartmentService departmentService;

	public DepartmentsController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	@PostMapping("/add")
	public ResponseEntity<Department>add(@RequestBody DepartmentRequestDto departmentRequestDto){
		return ResponseEntity.ok(departmentService.add(departmentRequestDto));
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<DepartmentDto>>get(){
		return ResponseEntity.ok(departmentService.get());
	}
}
