package com.firat.societies.service;

import java.util.List;

import com.firat.societies.model.Grade;

public interface GradeService {

	Grade add(Grade grade);
	List<Grade>getAll();
}
