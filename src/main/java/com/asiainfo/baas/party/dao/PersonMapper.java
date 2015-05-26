package com.asiainfo.baas.party.dao;

import java.util.List;

import com.asiainfo.baas.party.bean.Person;

public interface PersonMapper {
	public List<Person> getPersonList();
	
	public void addPerson(Person person);
	
	public Person getPersonById(String id);
}
