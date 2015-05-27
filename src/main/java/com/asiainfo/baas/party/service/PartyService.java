package com.asiainfo.baas.party.service;

import com.asiainfo.baas.party.bean.*;

public interface PartyService {

	/**
	 * 
	 * @param party
	 */
	void createParty(Party party);

	/**
	 * ��֤��¼���Ƿ���Ϲ���
	 * @param party
	 */
	boolean validateLoginName(Party party);

	/**
	 * ����û��Ƿ�Ψһ
	 * @param loginName
	 */
	boolean checkLoginNameUniqueness(String loginName);

}