package com.project.resume.entity;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class resume {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long resumeId;
	private String name;
	private String details;
	@ManyToMany
	@JoinTable(name="resume_user",
	joinColumns = @JoinColumn(name="resumeId"),
	inverseJoinColumns=@JoinColumn(name="userId"))
	private List<User>users;
	
	@OneToMany(mappedBy = "resume",cascade=CascadeType.ALL)
	private List<skills> skills;
	@OneToMany(mappedBy = "resume",cascade=CascadeType.ALL)
	private List<certificates> certificates;
	@OneToMany(mappedBy = "resume",cascade=CascadeType.ALL)
	private List<experience> experience;
	@OneToMany(mappedBy = "resume",cascade=CascadeType.ALL)
	private List<resume> resume;
	@OneToMany(mappedBy = "resume",cascade=CascadeType.ALL)
	private List<projects> projects;
	
	
	
	public Long getResumeId() {
		return resumeId;
	}
	public void setResumeId(Long resumeId) {
		this.resumeId = resumeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public List<skills> getSkills() {
		return skills;
	}
	public void setSkills(List<skills> skills) {
		this.skills = skills;
	}
	public List<certificates> getCertificates() {
		return certificates;
	}
	public void setCertificates(List<certificates> certificates) {
		this.certificates = certificates;
	}
	public List<experience> getExperience() {
		return experience;
	}
	public void setExperience(List<experience> experience) {
		this.experience = experience;
	}
	public List<resume> getResume() {
		return resume;
	}
	public void setResume(List<resume> resume) {
		this.resume = resume;
	}
	public List<projects> getProjects() {
		return projects;
	}
	public void setProjects(List<projects> projects) {
		this.projects = projects;
	}
	public resume(Long id, String name, String userName, String phoneNo, String email, String password, Long resumeId,
			List<com.project.resume.entity.skills> skills, List<com.project.resume.entity.certificates> certificates,
			List<com.project.resume.entity.experience> experience, List<com.project.resume.entity.resume> resume,
			List<com.project.resume.entity.projects> projects) {
		super();
		
		this.name = name;
		this.resumeId = resumeId;
		this.skills = skills;
		this.certificates = certificates;
		this.experience = experience;
		this.resume = resume;
		this.projects = projects;
	}
	public resume() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
