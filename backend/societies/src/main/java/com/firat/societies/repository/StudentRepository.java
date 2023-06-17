package com.firat.societies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firat.societies.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
