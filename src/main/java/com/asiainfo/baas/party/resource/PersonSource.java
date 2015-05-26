package com.asiainfo.baas.party.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.baas.party.bean.Person;
import com.asiainfo.baas.party.service.PersonService;
@Service
@Path("/person")
public class PersonSource {
	
	@Autowired
	private PersonService personService;
	
	@GET
	@Path("/persons")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> getPersons(){
		return personService.getPersonList();
	}
	
	@POST
	@Path("/person")
	@Consumes({ "application/json", "application/xml" })
	public String createPerson(Person person){
		JSONObject result=new JSONObject();
		 Person newPerson=personService.createPerson(person);
		 result.put("code","1");
		 result.put("mseg", "OK");
		 result.put("result", newPerson);
		 return result.toString();
	}
	@GET
	@Path("/{id}")//ืสิด:
	@Produces(MediaType.APPLICATION_JSON)
	public Person getPerson(@PathParam("id") String id){
		
		return personService.getPersonById(id);
		
	}

}
