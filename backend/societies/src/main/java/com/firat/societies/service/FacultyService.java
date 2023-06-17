package com.firat.societies.service;

import java.util.List;

import com.firat.societies.dto.FacultyDto;
import com.firat.societies.dto.FacultyRequestDto;
import com.firat.societies.model.Faculty;

public interface FacultyService {

	Faculty add(FacultyRequestDto facultyRequestDto);
	List<FacultyDto>get();
}
