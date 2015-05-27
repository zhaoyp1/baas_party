package com.asiainfo.baas.party.service.impl;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.baas.party.bean.Party;
import com.asiainfo.baas.party.dao.PartyMapper;
import com.asiainfo.baas.party.service.PartyService;
import com.asiainfo.baas.party.util.CommonUtil;
@Service
public class PartyServiceImpl implements PartyService {

		@Autowired
		private PartyMapper partyDao;
	
		/**
		 * 
		 * @param party
		 */
		public void createParty(Party party) {
			
			String id=CommonUtil.getGenerateId();
			
			party.setPartyId(id);
			
			partyDao.addParty(party);
		}

	/**
	 * 验证登录名是否符合规则
	 * @param party
	 */
	public boolean validateLoginName(Party party) {
		boolean flag=false;
		
		if(party==null||"".equals(party.getLoginName())) return flag;
		
		String pattern="[a-zA-Z0-9@.-]+";
		flag = Pattern.matches(pattern, party.getLoginName());
		
		return flag;

	}

	/**
	 * 检查用户是否唯一
	 * @param loginName
	 */
	public boolean checkLoginNameUniqueness(String loginName) {
		List<Party> partyNames=partyDao.getPartyByLoginName(loginName);
		if(partyNames==null || partyNames.size()<=0){
			return true;
		}
		return false;
		
	}

}