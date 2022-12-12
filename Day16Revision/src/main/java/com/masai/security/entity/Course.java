package com.masai.security.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Course {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String name;
	

	@JsonIgnore
	@ManyToMany(mappedBy = "courses",cascade = CascadeType.ALL)
	private List<Student> students = new ArrayList<>();
	
	@UpdateTimestamp
	private LocalDateTime lastUpdatedDate;
	
	@CreationTimestamp
	private LocalDateTime createdDate;

	public Course(String name, LocalDateTime lastUpdatedDate, LocalDateTime createdDate) {
		super();
		this.name = name;
		this.lastUpdatedDate = lastUpdatedDate;
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", students=" + students + ", lastUpdatedDate=" + lastUpdatedDate
				+ ", createdDate=" + createdDate + "]";
	}
	
	

	

}