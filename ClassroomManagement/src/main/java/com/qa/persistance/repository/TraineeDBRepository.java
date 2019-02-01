package com.qa.persistance.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistance.domain.Classroom;
import com.qa.persistance.domain.Trainees;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class TraineeDBRepository implements TraineesRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	@Transactional(REQUIRED)
	public String getAlltrainees() {
		Query query = manager.createQuery("SELECT from Trainees a", Trainees.class);
		Collection<Trainees> trainees = (Collection<Trainees>) query.getResultList();
		return util.getJSONForObject(query);
	}

	@Transactional(REQUIRED)
	public String createTrainee(String trainee) {
		Classroom atrainee = util.getObjectForJSON(trainee, Classroom.class);
		manager.persist(atrainee);
		return "{\"Message\": \"Trainee Sucessfully Added\"}";
	}

	public String deleteTrainee(Long traineeid) {
		Trainees traineeDB = findatrainee(traineeid);
		if (traineeDB != null) {
			manager.remove(traineeDB);
		}
		return "{\"Message\": \"Trainee Sucessfully Removed\"}";
	}

	private Trainees findatrainee(Long traineeid) {
		return manager.find(Trainees.class, traineeid);
	}

	public String updateTrainee(Long traineeid, String trainee) {
		// TODO Auto-generated method stub
		return null;
	}

}
