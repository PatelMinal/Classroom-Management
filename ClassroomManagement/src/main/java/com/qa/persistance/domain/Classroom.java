package com.qa.persistance.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Classroom {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id

	private Long classroomid;
	private String trainer;

	public Classroom() {
	}

	public Classroom(String trainer) {
		this.setTrainer(trainer);

	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public Long getId() {
		return classroomid;
	}

	public void setId(Long classroomid) {
		this.classroomid = classroomid;
	}

}
