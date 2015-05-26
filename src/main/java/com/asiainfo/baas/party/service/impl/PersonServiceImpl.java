package com.asiainfo.baas.party.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.baas.party.bean.Person;
import com.asiainfo.baas.party.dao.PersonMapper;
import com.asiainfo.baas.party.service.PersonService;
import com.asiainfo.baas.party.util.CommonUtil;


@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonMapper persondao;
	
	@Override
	public List<Person> getPersonList() {
		List<Person> personList=persondao.getPersonList();
		
		return personList;
	}
	
	public Person createPerson(Person person){
		String id=CommonUtil.getGenerateId();
		person.setId(id);
		persondao.addPerson(person);
		return person;
		
	}

	@Override
	public Person getPersonById(String id) {
		return persondao.getPersonById(id);
	}

}
