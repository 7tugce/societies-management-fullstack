package com.firat.societies.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firat.societies.dto.SocietiesApplicationDto;
import com.firat.societies.dto.SocietiesApplicationRequestDto;
import com.firat.societies.model.SocietiesApplication;
import com.firat.societies.service.SocietiesApplicationService;

@RestController
@RequestMapping("/api/societiesApplications")
@CrossOrigin
public class SocietiesApplicationsController {

	private final SocietiesApplicationService societiesApplicationService;

	public SocietiesApplicationsController(SocietiesApplicationService societiesApplicationService) {
		this.societiesApplicationService = societiesApplicationService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<SocietiesApplicationRequestDto>add(@RequestBody SocietiesApplicationRequestDto societiesApplicationRequestDto){
		return ResponseEntity.ok(societiesApplicationService.add(societiesApplicationRequestDto));
	}
	
	@GetMapping("/get-all")
	public ResponseEntity<List<SocietiesApplicationDto>>getAll(){
		return ResponseEntity.ok(societiesApplicationService.getAll());
	}
}
