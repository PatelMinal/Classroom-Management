package com.qa.persistance.repository;

public interface TraineesRepository {
	
	String getAlltrainees();
	
	String createTrainee(String trainee);
	
	String deleteTrainee(Long traineeid);
	
	String updateTrainee(Long traineeid, String trainee);
	

}
