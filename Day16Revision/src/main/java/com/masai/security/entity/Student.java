package com.masai.security.entity;

import java.util.ArrayList;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String userName;
	
	private String email;
	private String password;
	private String role;
	private String address;

	
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="STUDENT_COURSE",
	joinColumns = @JoinColumn(name="STUDENT_ID"),
	inverseJoinColumns = @JoinColumn(name = "COURSE_ID"))
	private List<Course> courses = new ArrayList<>();
	
	
}
