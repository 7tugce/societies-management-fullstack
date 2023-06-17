package com.firat.societies.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firat.societies.dto.DegreeDto;
import com.firat.societies.dto.DegreeRequestDto;
import com.firat.societies.model.Degree;
import com.firat.societies.service.DegreeService;

@RestController
@RequestMapping("/api/degrees")
@CrossOrigin
public class DegreesController {
	
	private final DegreeService degreeService;

	public DegreesController(DegreeService degreeService) {
		this.degreeService = degreeService;
	}
	
	@PostMapping("/add")
	ResponseEntity<Degree> add(@RequestBody DegreeRequestDto degree){
		return ResponseEntity.ok(degreeService.add(degree));
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<DegreeDto>> getAll() {
		return ResponseEntity.ok(degreeService.getAll());
	}
}
