package com.firat.societies.service;

import java.util.List;

import com.firat.societies.dto.SocietyDto;
import com.firat.societies.dto.SocietyRequestDto;
import com.firat.societies.model.Society;

public interface SocietyService {

	Society add(SocietyRequestDto society);
	List<SocietyDto>get();
}
