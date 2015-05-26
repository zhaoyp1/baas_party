package com.asiainfo.baas.party.dao;

import com.asiainfo.baas.party.bean.Individual;

public interface IndividualMapper {

	public void createIndividual(Individual individual);

	public Individual getIndividualById(String id);
	
	public void updateIndividual(Individual individual);
}
