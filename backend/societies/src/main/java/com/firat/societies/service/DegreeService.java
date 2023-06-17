package com.firat.societies.service;

import java.util.List;

import com.firat.societies.dto.DegreeDto;
import com.firat.societies.dto.DegreeRequestDto;
import com.firat.societies.model.Degree;

public interface DegreeService {
	Degree add(DegreeRequestDto degreeRequestDto);
	 List<DegreeDto>getAll();
}
