package com.firat.societies.dto;

import java.util.List;

import com.firat.societies.model.SocietyImage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocietyDto {

	private int id;
	private String societyLogoImageUrl;
	private String societyName;
	private String societyNameAbbreviation;
	private String societyFoundationYear;
	private int societyMembers;
	private String societyDescription;
	private String societyInstagram;
	private String societyYoutube;
	private String societyTwitter;
	private String societyWebsite;
	private String societyLinkedIn;
	private String societyMail;
	private List<SocietyImage> societyImages;
}
