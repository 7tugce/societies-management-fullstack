package com.firat.societies.service.impl;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.firat.societies.core.jwt.JwtUtil;
import com.firat.societies.dto.LoginDto;
import com.firat.societies.model.User;
import com.firat.societies.repository.UserRepository;
import com.firat.societies.service.AuthService;

@Service
public class AuthImpl implements AuthService{

	private final UserRepository userRepository;
	private final AuthenticationManager authenticationManager;
	private final JwtUtil jwtUtil;
	
	public AuthImpl(UserRepository userRepository, AuthenticationManager authenticationManager, JwtUtil jwtUtil) {
		this.userRepository = userRepository;
		this.authenticationManager = authenticationManager;
		this.jwtUtil = jwtUtil;
	}

	@Override
	public String login(LoginDto loginDto) throws Exception {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        User user = userRepository.findByStudentNum(loginDto.getStudentNum()).
                orElseThrow(() -> new UsernameNotFoundException("Wrong password or email"));

        boolean isPasswordMatch = passwordEncoder.matches(loginDto.getPassword(), user.getPassword());
        if(!isPasswordMatch) throw new IllegalStateException("Geçersiz kullanıcı adı yada şifre");

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginDto.getStudentNum(), user.getPassword()));
        } catch(Exception e) {
            throw new Exception("authentication failed "+ e );
        }

        return jwtUtil.generateToken(loginDto.getStudentNum());
	}
	
}
