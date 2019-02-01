package com.qa.bussiness.service;

import javax.inject.Inject;

import com.qa.persistance.repository.ClassroomRepository;


public class ClassroomServiceImpl implements ClassroomService {
	
	@Inject
	private ClassroomRepository repo;

	public String getAlltrainers() {
		return repo.getAlltrainers();
	}

	public String createTrainer(String trainer) {
		return repo.createTrainer(trainer);
	}

	public String deleteTrainer(Long classroomid) {
		return repo.deleteTrainer(classroomid);
	}

	public String updateTrainer(Long classroomid, String trainer) {
		return repo.updateTrainer(classroomid, trainer);
	}
	
	public void setRepo(ClassroomRepository  repo) {
		this.repo = repo;
	}

}
