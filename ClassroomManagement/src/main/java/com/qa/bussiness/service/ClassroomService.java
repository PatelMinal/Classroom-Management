package com.qa.bussiness.service;

public interface ClassroomService {
	
	String getAlltrainers();
	
	String createTrainer(String trainer);
	
	String deleteTrainer(Long classroomid);
	
	String updateTrainer(Long classroomid, String trainer);
}