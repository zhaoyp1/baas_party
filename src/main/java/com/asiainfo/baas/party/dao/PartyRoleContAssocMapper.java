package com.asiainfo.baas.party.dao;

import java.util.List;

import com.asiainfo.baas.party.bean.PartyRoleContAssoc;

public interface PartyRoleContAssocMapper {
	 
	public void deletePartyRoleContAssocById(String partyRoleContId);
 
	public void createPartyRoleContAssoc(PartyRoleContAssoc partyRoleContAssoc);

	 
	public List<PartyRoleContAssoc> getPartyRoleContAssocByPartyRoleId(
			String partyRoleId);

}
