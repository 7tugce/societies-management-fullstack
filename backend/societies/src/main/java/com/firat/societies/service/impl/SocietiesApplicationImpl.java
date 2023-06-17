package com.firat.societies.service.impl;

import java.util.List;

import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.stereotype.Service;

import com.firat.societies.core.dtoConverter.DtoconverterService;
import com.firat.societies.dto.SocietiesApplicationDto;
import com.firat.societies.dto.SocietiesApplicationRequestDto;
import com.firat.societies.model.SocietiesApplication;
import com.firat.societies.repository.SocietiesApplicationRepository;
import com.firat.societies.service.SocietiesApplicationService;

@Service
public class SocietiesApplicationImpl implements SocietiesApplicationService{

	private final SocietiesApplicationRepository societiesApplicationRepository;
	private final DtoconverterService dtoconverterService;

	public SocietiesApplicationImpl(SocietiesApplicationRepository societiesApplicationRepository, 
			DtoconverterService dtoconverterService) {
		this.societiesApplicationRepository = societiesApplicationRepository;
		this.dtoconverterService = dtoconverterService;
	}

	@Override
	public SocietiesApplicationRequestDto add(SocietiesApplicationRequestDto societiesApplication) {
		 societiesApplicationRepository.save((SocietiesApplication) dtoconverterService.dtoClassConverter(societiesApplication, SocietiesApplication.class));
		return societiesApplication;
	}

	@Override
	public List<SocietiesApplicationDto> getAll() {
		return dtoconverterService.dtoConverter(societiesApplicationRepository.findAll(), SocietiesApplicationDto.class);
	}
	
	
}
