package com.asiainfo.baas.party.service;

import com.asiainfo.baas.party.bean.*;

public interface ContantMediumService {

	/**
	 * 
	 * @param partyRoleId
	 * @param contantMediums
	 */
	boolean saveContantMedium(String partyRoleId, ContantMedium[] contantMediums);

	/**
	 * 
	 * @param contMedCode ��ϵý�����
	 * @param contMedValue ��У���ֵ
	 */
	boolean validateContantMedium(String contMedCode, String contMedValue);

}