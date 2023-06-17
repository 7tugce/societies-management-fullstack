package com.firat.societies.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firat.societies.dto.SocietyManagerRequestDto;
import com.firat.societies.dto.StudentRequestDto;
import com.firat.societies.service.RegisterSocietyManagerService;
import com.firat.societies.service.RegisterStudentService;

@RestController
@RequestMapping("/api/registers")
@CrossOrigin
public class RegistersController {
	
	private final RegisterStudentService registerStudentService;
	private final RegisterSocietyManagerService registerSocietyManagerService;
	
	public RegistersController(RegisterStudentService registerStudentService,
			RegisterSocietyManagerService registerSocietyManagerService) {
		this.registerStudentService = registerStudentService;
		this.registerSocietyManagerService = registerSocietyManagerService;
	}
	
	@PostMapping("/student")
	public ResponseEntity<StudentRequestDto> registerStudent(@RequestBody StudentRequestDto student) {
		return ResponseEntity.ok(registerStudentService.registerStudent(student));
	}
	
	@PostMapping("/society-manager")
	public ResponseEntity<SocietyManagerRequestDto> registerSocietyManager(@RequestBody SocietyManagerRequestDto societyManager){
		return ResponseEntity.ok(registerSocietyManagerService.registerSocietyManager(societyManager));
	}
}
