package com.qa.bussiness.service;

public interface TraineeService {
	
	String getAlltrainees();
	
	String createTrainee(String trainee);
	
	String deleteTrainee(Long traineeid);
	
	String updateTrainee(Long traineeid, String trainee);
	
}
