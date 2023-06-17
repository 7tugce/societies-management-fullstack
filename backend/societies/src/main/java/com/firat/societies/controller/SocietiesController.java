package com.firat.societies.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firat.societies.dto.SocietyDto;
import com.firat.societies.dto.SocietyRequestDto;
import com.firat.societies.model.Society;
import com.firat.societies.service.SocietyService;

@RestController
@RequestMapping("/api/societies")
@CrossOrigin
public class SocietiesController {
	
	private final SocietyService societyService;

	public SocietiesController(SocietyService societyService) {
		this.societyService = societyService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<Society>add(@RequestBody SocietyRequestDto society){
		return ResponseEntity.ok(societyService.add(society));
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<SocietyDto>>get(){
		return ResponseEntity.ok(societyService.get());
	}
}
