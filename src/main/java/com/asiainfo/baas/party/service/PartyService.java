package com.asiainfo.baas.party.service;

import com.asiainfo.baas.party.bean.*;

public interface PartyService {

	/**
	 * 
	 * @param party
	 */
	void createParty(Party party);

	/**
	 * 验证登录名是否符合规则
	 * @param party
	 */
	boolean validateLoginName(Party party);

	/**
	 * 检查用户是否唯一
	 * @param loginName
	 */
	boolean checkLoginNameUniqueness(String loginName);
	
	/**
	 * 修改个人订户信息
	 * @param individual
	 */
	void modifyIndividual(Individual individual);

	/**
	 * 修改组织信息
	 * @param organization
	 */
	void modifyOrganization(Organization organization);

	/**
	 * 保存证件信息
	 * @param identification
	 */
	void saveIdentification(PartyIdentification identification);

}