package com.asiainfo.baas.party.dao;

import java.util.List;

import com.asiainfo.baas.party.bean.PartyName;
import com.asiainfo.baas.party.bean.PartyRole;

public interface PartyNameMapper {
	/**
	 * 添加一个角色
	 * @param partyRole
	 */
	public void addPartyName(PartyName partyName);

	/**
	 * 根据partyId查询角色
	 */
	public List<PartyRole> getPartyNamesByPartyId(String partyId);
	/**
	 * 根据partyId删除一个角色
	 */
	public void deletePartyNameByPartyNameId(String partyNameId);
	/**
	 * 修改角色
	 */
	public void updatePartyRole(PartyName partyName);

}
