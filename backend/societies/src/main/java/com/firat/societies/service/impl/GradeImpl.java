package com.firat.societies.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.firat.societies.model.Grade;
import com.firat.societies.repository.GradeRepository;
import com.firat.societies.service.GradeService;

@Service
public class GradeImpl implements GradeService{

	private final GradeRepository gradeRepository;

	public GradeImpl(GradeRepository gradeRepository) {
		this.gradeRepository = gradeRepository;
	}

	@Override
	public Grade add(Grade grade) {
		return gradeRepository.save(grade);
	}

	@Override
	public List<Grade> getAll() {
		return gradeRepository.findAll();
	}
	
}
