package com.asiainfo.baas.party.dao;

import java.util.List;

import com.asiainfo.baas.party.bean.PartyRoleContAssoc;

public interface PartyRoleContAssocMapper {
	/**
	 * 根据partyRoleContId删除一个partyRole和contantMediumg关系
	 */
	public void deletePartyRoleContAssocById(String partyRoleContId);

	/**
	 * 新增一个联系媒介关系
	 */
	public void createPartyRoleContAssoc(PartyRoleContAssoc partyRoleContAssoc);

	/**
	 * 查询联系媒介关系
	 */
	public List<PartyRoleContAssoc> getPartyRoleContAssocByPartyRoleId(
			String partyRoleId);

}
