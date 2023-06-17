package com.firat.societies.service;

import com.firat.societies.dto.LoginDto;

public interface AuthService {

	String login(LoginDto loginDto) throws Exception;
}
