package com.asiainfo.baas.party.dao;

import java.util.List;

import com.asiainfo.baas.party.bean.PartyRoleAssociation;

public interface PartyRoleAssociationMapper {
	/**
	 * 添加一个角色关系
	 * @param partyRole
	 */
	public void addPartyRoleAssociation(PartyRoleAssociation partyRoleAssociation);

	/**
	 * 根据partyId查询角色
	 */
	public List<PartyRoleAssociation> getPartyRolesAssoByPartyRoleId(String partyRoleId);
	/**
	 * 根据partyId删除一个角色
	 */
	public void delPartyRoleAssoByAssociationId(String associationId);
	/**
	 * 修改角色
	 */
	public void updatePartyRoleAssociation(PartyRoleAssociation partyRoleAssociation);

}
