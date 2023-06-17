package com.firat.societies.service;

import java.util.List;

import com.firat.societies.dto.SocietiesApplicationDto;
import com.firat.societies.dto.SocietiesApplicationRequestDto;
import com.firat.societies.model.SocietiesApplication;

public interface SocietiesApplicationService {

	SocietiesApplicationRequestDto add(SocietiesApplicationRequestDto socitiesApplication);
	List<SocietiesApplicationDto>getAll();
}
