package com.asiainfo.baas.party.dao;

import java.util.List;

import com.asiainfo.baas.party.bean.Party;

public interface PartyMapper {
	
	public List<Party> getPartyList();
	
	public void addParty(Party party);
	
	public Party getPartyById(String partyId);
	
	public void updateParty(Party party);
	
	public void  delParty(String partyId);
	
	public List<Party> getPartyByLoginName(String loginName);
	

}
