package com.firat.societies.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.firat.societies.core.dtoConverter.DtoconverterService;
import com.firat.societies.dto.SocietyConfirmedByManagerDto;
import com.firat.societies.dto.SocietyConfirmedByManagerRequestDto;
import com.firat.societies.model.SocietyConfirmedByManager;
import com.firat.societies.repository.SocietyConfirmedByManagerRepository;
import com.firat.societies.service.SocietyConfirmedByManagerService;

@Service
public class SocietyConfirmedByManagerImpl implements SocietyConfirmedByManagerService{

	private final SocietyConfirmedByManagerRepository societyConfirmedByManagerRepository;
	private final DtoconverterService dtoconverterService;
	
	public SocietyConfirmedByManagerImpl(SocietyConfirmedByManagerRepository societyConfirmedByManagerRepository,
			DtoconverterService dtoconverterService) {
		this.societyConfirmedByManagerRepository = societyConfirmedByManagerRepository;
		this.dtoconverterService = dtoconverterService;
	}

	@Override
	public SocietyConfirmedByManager add(SocietyConfirmedByManagerRequestDto societyConfirmedByManagerDto) {
		return societyConfirmedByManagerRepository.save((SocietyConfirmedByManager) dtoconverterService.dtoClassConverter(societyConfirmedByManagerDto, SocietyConfirmedByManager.class));
	}

	@Override
	public List<SocietyConfirmedByManagerDto> getAll() {
		return dtoconverterService.dtoConverter(societyConfirmedByManagerRepository.findAll(), SocietyConfirmedByManagerDto.class);
	}
	
	
}
