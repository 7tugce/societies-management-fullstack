package com.firat.societies.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firat.societies.dto.LoginDto;
import com.firat.societies.service.AuthService;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {

	private final AuthService authService;
	
    public AuthController(AuthService authService) {
		this.authService = authService;
	}

	@PostMapping(value = "/login")
    public String login(@RequestBody LoginDto loginDto) throws Exception {
        return authService.login(loginDto);
    }
	
}
