package com.asiainfo.baas.party.dao;

import java.util.List;

import com.asiainfo.baas.party.bean.PartyRole;

public interface PartyRoleMapper {
	/**
	 * 添加一个角色
	 * @param partyRole
	 */
	public void addPartyRole(PartyRole partyRole);

	/**
	 * 根据partyId查询角色
	 */
	public List<PartyRole> getPartyRolesByPartyId(String partyId);
	/**
	 * 根据partyId删除一个角色
	 */
	public void deletePartyRoleByPartyRoleId(String partyRoleId);
	/**
	 * 修改角色
	 */
	public void updatePartyRole(PartyRole partyRole);
}
