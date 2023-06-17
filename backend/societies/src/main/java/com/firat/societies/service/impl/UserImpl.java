package com.firat.societies.service.impl;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.firat.societies.model.User;
import com.firat.societies.repository.UserRepository;
import com.firat.societies.service.UserService;

@Service
public class UserImpl implements UserService{
	
	private final UserRepository userRepository;

	public UserImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String studentNum) throws UsernameNotFoundException {
		User user = userRepository.findByStudentNum(studentNum).orElseThrow(() ->
        new UsernameNotFoundException("User not found."));

		 return new org.springframework.security.core.userdetails.User(
        user.getStudentNum(), user.getPassword(), new ArrayList<>());
	}
	
}
