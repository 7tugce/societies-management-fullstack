package com.firat.societies.service.impl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.firat.societies.core.dtoConverter.DtoconverterService;
import com.firat.societies.dto.SocietyManagerRequestDto;
import com.firat.societies.model.SocietyManager;
import com.firat.societies.repository.SocietyManagerRepository;
import com.firat.societies.service.RegisterSocietyManagerService;

@Service
public class RegisterSocietyManagerImpl implements RegisterSocietyManagerService{

	private final SocietyManagerRepository societyManagerRepository;
	private final DtoconverterService dtoconverterService;

	public RegisterSocietyManagerImpl(SocietyManagerRepository societyManagerRepository, DtoconverterService dtoconverterService) {
		this.societyManagerRepository = societyManagerRepository;
		this.dtoconverterService = dtoconverterService;
	}

	@Override
	public SocietyManagerRequestDto registerSocietyManager(SocietyManagerRequestDto societyManager) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		societyManager.setPassword(bCryptPasswordEncoder.encode(societyManager.getPassword()));
		societyManagerRepository.save((SocietyManager) dtoconverterService.dtoClassConverter(societyManager, SocietyManager.class));
		return societyManager;
	} 
}
