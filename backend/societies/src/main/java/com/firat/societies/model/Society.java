package com.firat.societies.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "societies")
public class Society {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "society_logo_image_url")
	private String societyLogoImageUrl;
	
	@Column(name = "society_name")
	private String societyName;
	
	@Column(name = "society_name_abbreviation")
	private String societyNameAbbreviation;
	
	@Column(name = "society_foundation_year")
	private String societyFoundationYear;
	
	@Column(name = "society_members")
	private int societyMembers;
	
	@Column(name = "society_description")
	private String societyDescription;
	
	@Column(name = "society_instagram")
	private String societyInstagram;
	
	@Column(name = "society_youtube")
	private String societyYoutube;
	
	@Column(name = "society_twitter")
	private String societyTwitter;
	
	@Column(name = "society_website")
	private String societyWebsite;
	
	@Column(name = "society_linkedin")
	private String societyLinkedIn;
	
	@Column(name = "society_mail")
	private String societyMail;
	
	@Column(name = "is_active")
	private boolean isActive = true;
	
	@OneToMany(mappedBy = "societies")
	private List<SocietyImage> societyImages;
	
	@OneToMany(mappedBy = "society")
	private List<SocietyManager> societyManagers;
	
}

