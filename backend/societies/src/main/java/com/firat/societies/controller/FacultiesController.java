package com.firat.societies.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firat.societies.dto.FacultyDto;
import com.firat.societies.dto.FacultyRequestDto;
import com.firat.societies.model.Faculty;
import com.firat.societies.service.FacultyService;

@RestController
@RequestMapping("/api/faculties")
@CrossOrigin
public class FacultiesController {

	private final FacultyService facultyService;

	public FacultiesController(FacultyService facultyService) {
		this.facultyService = facultyService;
	}

	@PostMapping("/add")
	public ResponseEntity<Faculty>add(@RequestBody FacultyRequestDto facultyRequestDto){
		return ResponseEntity.ok(facultyService.add(facultyRequestDto));
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<FacultyDto>>get(){
		return ResponseEntity.ok(facultyService.get());
	}
}
