package com.asiainfo.baas.party.dao;

import java.util.List;

import com.asiainfo.baas.party.bean.PartyRoleAssociation;

public interface PartyRoleAssociationMapper {
	 
	public void addPartyRoleAssociation(PartyRoleAssociation partyRoleAssociation);

	 
	public List<PartyRoleAssociation> getPartyRolesAssoByPartyRoleId(String partyRoleId);
	 
	public void delPartyRoleAssoByAssociationId(String associationId);
	 
	public void updatePartyRoleAssociation(PartyRoleAssociation partyRoleAssociation);

}
