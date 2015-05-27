package com.asiainfo.baas.party.dao;

import java.util.List;

import com.asiainfo.baas.party.bean.PartyIdentification;

public interface PartyIdentificationMapper {
	 
	
	public List<PartyIdentification> getPartyIdentificationByPartyId(String parttyId);
	
	public void createPartyIdentification(PartyIdentification partyIdentification);
	
	public void updatePartyIdentification(PartyIdentification partyIdentification);
	
	

}
