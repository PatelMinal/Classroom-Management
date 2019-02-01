package com.qa.persistance.repository;

public interface ClassroomRepository {

	String getAlltrainers();
	
	String createTrainer(String trainer);
	
	String deleteTrainer(Long classroomid);
	
	String updateTrainer(Long classroomid, String trainer);
}

