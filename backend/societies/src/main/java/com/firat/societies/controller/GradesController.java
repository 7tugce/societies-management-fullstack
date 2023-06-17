package com.firat.societies.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firat.societies.model.Grade;
import com.firat.societies.service.GradeService;


@RestController
@RequestMapping("/api/grades")
@CrossOrigin
public class GradesController {

	private final GradeService gradeService;

	public GradesController(GradeService gradeService) {
		this.gradeService = gradeService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<Grade> add(@RequestBody Grade grade) {
		return ResponseEntity.ok(gradeService.add(grade));
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Grade>> get(){
		return ResponseEntity.ok(gradeService.getAll());
	}

}
