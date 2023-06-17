package com.firat.societies.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firat.societies.dto.SocietyConfirmedByManagerDto;
import com.firat.societies.dto.SocietyConfirmedByManagerRequestDto;
import com.firat.societies.model.SocietyConfirmedByManager;
import com.firat.societies.service.SocietyConfirmedByManagerService;

@RestController
@RequestMapping("/api/societyConfirmedByManager")
@CrossOrigin
public class SocietiesConfirmedByManagersController {

	private final SocietyConfirmedByManagerService societyConfirmedByManagerService;

	public SocietiesConfirmedByManagersController(SocietyConfirmedByManagerService societyConfirmedByManagerService) {
		this.societyConfirmedByManagerService = societyConfirmedByManagerService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<SocietyConfirmedByManager> add(@RequestBody SocietyConfirmedByManagerRequestDto societyConfirmedByManagerRequestDto){
		return ResponseEntity.ok(societyConfirmedByManagerService.add(societyConfirmedByManagerRequestDto));
	}
	
	@GetMapping("/get-all")
	public ResponseEntity<List<SocietyConfirmedByManagerDto>>getAll(){
		return ResponseEntity.ok(societyConfirmedByManagerService.getAll());
	}
}
