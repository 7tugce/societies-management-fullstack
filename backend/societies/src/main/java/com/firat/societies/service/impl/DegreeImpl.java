package com.firat.societies.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.firat.societies.core.dtoConverter.DtoconverterService;
import com.firat.societies.dto.DegreeDto;
import com.firat.societies.dto.DegreeRequestDto;
import com.firat.societies.model.Degree;
import com.firat.societies.repository.DegreeRepository;
import com.firat.societies.service.DegreeService;

@Service
public class DegreeImpl implements DegreeService{

	private final DegreeRepository degreeRepository;
	private final DtoconverterService dtoconverterService;

	public DegreeImpl(DegreeRepository degreeRepository, DtoconverterService dtoconverterService) {
		this.degreeRepository = degreeRepository;
		this.dtoconverterService = dtoconverterService;
	}
	
	@Override
	public Degree add(DegreeRequestDto degreeRequestDto) {
		return degreeRepository.save((Degree) dtoconverterService.dtoClassConverter(degreeRequestDto, Degree.class));
	}

	@Override
	public List<DegreeDto> getAll() {
		return dtoconverterService.dtoConverter(degreeRepository.findAll(), DegreeDto.class);
	}
}
