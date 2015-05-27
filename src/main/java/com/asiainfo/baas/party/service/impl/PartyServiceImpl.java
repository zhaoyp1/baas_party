package com.asiainfo.baas.party.service.impl;

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

}