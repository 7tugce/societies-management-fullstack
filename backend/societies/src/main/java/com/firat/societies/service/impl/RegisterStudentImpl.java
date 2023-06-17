package com.firat.societies.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.firat.societies.core.dtoConverter.DtoconverterService;
import com.firat.societies.dto.StudentRequestDto;
import com.firat.societies.model.Student;
import com.firat.societies.repository.StudentRepository;
import com.firat.societies.service.RegisterStudentService;

@Service
public class RegisterStudentImpl implements RegisterStudentService{

	private final StudentRepository studentRepository;
	private final DtoconverterService dtoconverterService;

	public RegisterStudentImpl(StudentRepository studentRepository, DtoconverterService dtoconverterService) {
		this.studentRepository = studentRepository;
		this.dtoconverterService = dtoconverterService;
	}

	@Override
	public StudentRequestDto registerStudent(StudentRequestDto student) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        student.setPassword(bCryptPasswordEncoder.encode(student.getPassword())); 
        studentRepository.save((Student) dtoconverterService.dtoClassConverter(student, Student.class));
		return student;
	}
	
}
