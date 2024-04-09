package com.project.resume.entity;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class skills {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String computerLang;
	private String communicationLang;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnoreProperties("resume")
	@JoinColumn(name="resumeId")
	private resume resume;
	public resume getResume() {
		return resume;
	}
	public void setResume(resume resume) {
		this.resume = resume;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComputerLang() {
		return computerLang;
	}
	public void setComputerLang(String computerLang) {
		this.computerLang = computerLang;
	}
	public String getCommunicationLang() {
		return communicationLang;
	}
	public void setCommunicationLang(String communicationLang) {
		this.communicationLang = communicationLang;
	}
	
	}
	
	


