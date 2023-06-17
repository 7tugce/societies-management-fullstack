package com.firat.societies.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocietiesApplicationRequestDto {

	private int id;
	private int studentId;
	private int societyId;
}
