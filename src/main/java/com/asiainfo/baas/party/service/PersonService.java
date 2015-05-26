package com.asiainfo.baas.party.service;

import java.util.List;

import com.asiainfo.baas.party.bean.Person;

public interface PersonService {
	
	public List<Person> getPersonList();
	
	public Person createPerson(Person person);
	
	public Person getPersonById(String id);

}
