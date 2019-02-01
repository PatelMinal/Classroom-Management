package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.bussiness.service.ClassroomService;

@Path("/trainer")
public class ClassroomEndpoint {
	
	@Inject
	private ClassroomService service;
	
	@Path("/getAlltrainers")
	
	@GET
	@Produces({ "application/json" })
	public String getAlltrainers() {
		return service.getAlltrainers();
	}
	
	@Path("/createAccount")
	@POST
	@Produces({ "application/json" })
	public String addTrainer(String trainer) {
		return service.createTrainer(trainer);
	}
	
	@Path("/deleteAccount/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteTrainer(@PathParam("id") Long classroomid) {
		return service.deleteTrainer(classroomid);
	}

	public void setService(ClassroomService service) {
		this.service = service;
	}
	

}
