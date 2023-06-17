package com.firat.societies.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocietyConfirmedByManagerRequestDto {

	private int id;
	private int societyManagerId;
	private int studentId;
	private boolean isConfirmed;
}
