package com.firat.societies.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.firat.societies.core.dtoConverter.DtoconverterService;
import com.firat.societies.dto.SocietyDto;
import com.firat.societies.dto.SocietyRequestDto;
import com.firat.societies.model.Society;
import com.firat.societies.repository.SocietyRepository;
import com.firat.societies.service.SocietyService;

@Service
public class SocietyImpl implements SocietyService{

	private final SocietyRepository societyRepository;
	private final DtoconverterService dtoconverterService;

	public SocietyImpl(SocietyRepository societyRepository, DtoconverterService dtoconverterService) {
		this.societyRepository = societyRepository;
		this.dtoconverterService = dtoconverterService;
	}

	@Override
	public Society add(SocietyRequestDto society) {
		return societyRepository.save((Society) dtoconverterService.dtoClassConverter(society, Society.class));
	}

	@Override
	public List<SocietyDto> get() {
		return dtoconverterService.dtoConverter(societyRepository.findAll(), SocietyDto.class);
	}
	    
}
