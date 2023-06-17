package com.firat.societies.core.jwt;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.firat.societies.service.UserService;

@Component
public class JwtFilter extends OncePerRequestFilter{
	
	private final JwtUtil jwtUtil;
    private final UserService userService;
        
	public JwtFilter(JwtUtil jwtUtil, UserService userService) {
		this.jwtUtil = jwtUtil;
		this.userService = userService;
	}



	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		 	String authorizationHeader = request.getHeader("Authorization");
	        String token = null;
	        String userName = null;

	        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
	            token = authorizationHeader.substring(7);
	            userName = jwtUtil.extractUsername(token);
	        }

	        if (userName != null && SecurityContextHolder.getContext().getAuthentication() == null) {
	            UserDetails userDetails = userService.loadUserByUsername(userName);

	            if (jwtUtil.validateToken(token, userDetails)) {

	                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
	                        new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
	                usernamePasswordAuthenticationToken
	                        .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
	                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
	            }
	        }
	        filterChain.doFilter(request, response);
	}
}

