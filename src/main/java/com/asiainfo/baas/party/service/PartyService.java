package com.asiainfo.baas.party.service;

import com.asiainfo.baas.party.bean.*;

public interface PartyService {

	/**
	 * 
	 * @param party
	 */
	String createParty(Party party);

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
	
	/**
	 * �޸ĸ��˶�����Ϣ
	 * @param individual
	 */
	void modifyIndividual(Individual individual);

	/**
	 * �޸���֯��Ϣ
	 * @param organization
	 */
	void modifyOrganization(Organization organization);

	/**
	 * ����֤����Ϣ
	 * @param identification
	 */
	void saveIdentification(PartyIdentification identification);
	
	/**
	 * ����partyName
	 * @param paryName
	 */
	public void createPartyName(PartyName partyName);

}