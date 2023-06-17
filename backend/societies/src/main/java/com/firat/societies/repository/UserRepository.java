package com.firat.societies.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firat.societies.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByEmail(String email);
	Optional<User> findByStudentNum(String studentNum);

}
