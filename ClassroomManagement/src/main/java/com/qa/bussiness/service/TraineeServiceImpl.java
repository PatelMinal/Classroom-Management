package com.qa.bussiness.service;

import javax.inject.Inject;

import com.qa.persistance.repository.ClassroomRepository;
import com.qa.persistance.repository.TraineeRepository;

public class TraineeServiceImpl implements TraineeService {
	
	@Inject
	private TraineeRepository repo;

	public String getAlltrainees() {
		return repo.getAlltrainees();
	}

	public String createTrainee(String trainee) {
		return repo.createTrainee(trainee);
	}

	public String deleteTrainee(Long traineeid) {
		return repo.deleteTrainee(traineeid);
	}

	public String updateTrainee(Long traineeid, String trainee) {
		return repo.updateTrainee(traineeid, trainee);
	}
	
	public void setRepo(TraineeRepository  repo) {
		this.repo = repo;
	}

}
