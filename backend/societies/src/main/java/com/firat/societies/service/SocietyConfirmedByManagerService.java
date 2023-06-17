package com.firat.societies.service;

import java.util.List;

import com.firat.societies.dto.SocietyConfirmedByManagerDto;
import com.firat.societies.dto.SocietyConfirmedByManagerRequestDto;
import com.firat.societies.model.SocietyConfirmedByManager;

public interface SocietyConfirmedByManagerService {
	
	SocietyConfirmedByManager add(SocietyConfirmedByManagerRequestDto societyConfirmedByManagerDto);
	List<SocietyConfirmedByManagerDto>getAll();
}
