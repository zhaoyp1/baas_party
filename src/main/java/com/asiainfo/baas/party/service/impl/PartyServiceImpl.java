package com.asiainfo.baas.party.service.impl;

import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.baas.party.bean.Individual;
import com.asiainfo.baas.party.bean.Organization;
import com.asiainfo.baas.party.bean.Party;
import com.asiainfo.baas.party.bean.PartyIdentification;
import com.asiainfo.baas.party.bean.PartyRole;
import com.asiainfo.baas.party.dao.IndividualMapper;
import com.asiainfo.baas.party.dao.OrganizationMapper;
import com.asiainfo.baas.party.dao.PartyIdentificationMapper;
import com.asiainfo.baas.party.dao.PartyMapper;
import com.asiainfo.baas.party.dao.PartyRoleMapper;
import com.asiainfo.baas.party.service.PartyService;
import com.asiainfo.baas.party.util.CommonUtil;
import com.asiainfo.baas.party.util.PartyConst;
@Service
public class PartyServiceImpl implements PartyService {

		@Autowired
		private PartyMapper partyDao;
		@Autowired
		private PartyRoleMapper partyRoleDao;
		@Autowired
		private IndividualMapper indivDao;
		@Autowired
		private OrganizationMapper organDao;
		@Autowired
		private PartyIdentificationMapper partyIdenDao;
	
		/**
		 * 
		 * @param party
		 */
		public void createParty(Party party) {
			
			String id=CommonUtil.getGenerateId();
			Date createDate = new Date();
			party.setPartyId(id);
			party.setStatus(PartyConst.CommonStatus_1);
			party.setCreateDate(createDate);
			partyDao.addParty(party);
		
			//个人订户
			if(PartyConst.partyTypeIndividual.equals(party.getPartyType())){
				Individual individual = new Individual();
				individual.setIndividualId(id);
				individual.setCreateDate(createDate);
				indivDao.createIndividual(individual);
			}else if(PartyConst.partyTypeOrganization.equals(party.getPartyType())){
				//组织订户
				Organization organization = new Organization();
				organization.setOrganizationId(id);
				organization.setCreateDate(createDate);
				organDao.addOrganization(organization);
			}
			String partyRoleId = CommonUtil.getGenerateId();
			PartyRole partyRole = new PartyRole();
			partyRole.setPartyRoleId(partyRoleId);
			partyRole.setPartyId(id);
			partyRole.setModifyDate(createDate);
			partyRole.setCreateDate(createDate);
			partyRole.setStatus(PartyConst.CommonStatus_1);
			partyRoleDao.addPartyRole(partyRole);
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
	/**
	 * 修改个人订户信息
	 * @param individual
	 */
	public void modifyIndividual(Individual individual) {
		indivDao.updateIndividual(individual);
	}
	/**
	 * 修改组织信息
	 * @param organization
	 */
	 
	public void modifyOrganization(Organization organization) {
		organDao.updateOrganization(organization);
	}
	
	/**
	 * 保存证件信息
	 * @param identification
	 */
	public void saveIdentification(PartyIdentification partyIdentification) {
		partyIdenDao.createPartyIdentification(partyIdentification);
	}

}