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

import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class ClassroomDBRepository implements ClassroomRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	@Transactional(REQUIRED)
	public String getAlltrainers() {
		Query query = manager.createQuery("SELECT from Classroom a", Classroom.class);
		Collection<Classroom> trainers = (Collection<Classroom>) query.getResultList();
		return util.getJSONForObject(query);
	}
		
	
	@Transactional(REQUIRED)
	public String createTrainer(String trainer) {
		Classroom atrainer = util.getObjectForJSON(trainer, Classroom.class);
		manager.persist(atrainer);
		return "{\"Message\": \"Trainer Sucessfully Added\"}";
	}

	public String deleteTrainer(Long classroomid) {
		Classroom trainerDB = findatrainer(classroomid);
		if (trainerDB != null) {
			manager.remove(trainerDB);
		}
		return "{\"Message\": \"Trainer Sucessfully Removed\"}";
	}
	private Classroom findatrainer(Long classroomid) {
		return manager.find(Classroom.class, classroomid);
	}

	public String updateTrainer(Long classroomid, String trainer) {
		Classroom updateTrainer = findatrainer(classroomid);
		deleteTrainer(classroomid);
		createTrainer(trainer);
		return "{\"message\": \"Trainer sucessfully updated\"}";
		
	}
	

}
