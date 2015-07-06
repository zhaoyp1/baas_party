package com.asiainfo.baas.party.dao;

import java.util.List;

import com.asiainfo.baas.party.bean.PartyRole;

public interface PartyRoleMapper {
	 
	public void addPartyRole(PartyRole partyRole);

	 
	public List<PartyRole> getPartyRolesByPartyId(String partyId);
	 
	public void deletePartyRoleByPartyRoleId(String partyRoleId);
	 
	public void updatePartyRole(PartyRole partyRole);
}
