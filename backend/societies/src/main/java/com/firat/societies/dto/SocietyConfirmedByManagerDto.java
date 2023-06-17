package com.firat.societies.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocietyConfirmedByManagerDto {

	private int id;
	private String societyManagerFirstName;
	private String studentFirstName;
	private LocalDate confirmDate;
	private boolean isConfirmed;
}
