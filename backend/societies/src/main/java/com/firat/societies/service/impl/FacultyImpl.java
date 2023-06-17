package com.firat.societies.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.firat.societies.core.dtoConverter.DtoconverterService;
import com.firat.societies.dto.FacultyDto;
import com.firat.societies.dto.FacultyRequestDto;
import com.firat.societies.model.Faculty;
import com.firat.societies.repository.FacultyRepository;
import com.firat.societies.service.FacultyService;

@Service
public class FacultyImpl implements FacultyService{

	private final FacultyRepository facultyRepository;
	private final DtoconverterService dtoconverterService;

	public FacultyImpl(FacultyRepository facultyRepository, DtoconverterService dtoconverterService) {
		this.facultyRepository = facultyRepository;
		this.dtoconverterService = dtoconverterService;
	}

	@Override
	public Faculty add(FacultyRequestDto facultyRequestDto) {
		return facultyRepository.save((Faculty) dtoconverterService.dtoClassConverter(facultyRequestDto, Faculty.class));
	}

	@Override
	public List<FacultyDto> get() {
		return dtoconverterService.dtoConverter(facultyRepository.findAll(), FacultyDto.class);
	}
	
}
