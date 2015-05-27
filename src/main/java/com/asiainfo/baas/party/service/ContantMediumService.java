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
	 * @param contMedCode 联系媒介编码
	 * @param contMedValue 待校验的值
	 */
	boolean validateContantMedium(String contMedCode, String contMedValue);

}