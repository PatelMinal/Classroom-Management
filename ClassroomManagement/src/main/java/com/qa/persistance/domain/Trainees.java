package com.qa.persistance.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Trainees {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id

	private Long traineeid;
	private String trainee;
	
	public Trainees() {
	}
	
	public Trainees (String trainee) {
		this.setTrainee(trainee);
	

}

	public String getTrainee() {
		return trainee;
	}

	public void setTrainee(String trainee) {
		this.trainee = trainee;
	}
	
	public Long getId() {
		return traineeid;
	}

	public void setId(Long traineeid) {
		this.traineeid = traineeid;
	}
}