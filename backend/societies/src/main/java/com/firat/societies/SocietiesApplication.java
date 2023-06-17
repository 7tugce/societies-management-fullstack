package com.firat.societies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition(info = @io.swagger.v3.oas.annotations.info.Info(title = "Socities API", description = "Firat University"))
public class SocietiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocietiesApplication.class, args);
	}
}
