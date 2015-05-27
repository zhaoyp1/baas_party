package com.asiainfo.baas.party.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.asiainfo.baas.party.bean.PartyName;
import com.asiainfo.baas.party.bean.PartyRole;
import com.asiainfo.baas.party.dao.PartyNameMapper;
import com.asiainfo.baas.party.dao.PartyRoleMapper;
@RunWith(SpringJUnit4ClassRunner.class) // 整合 
@ContextConfiguration(locations="classpath:applicationContext.xml") // 加载配置
public class JUnitTest {
	@Autowired
	PartyRoleMapper partyRoleDao ;
	@Autowired
	PartyNameMapper partyNameDao ;
	@Test
	public void addPartyRole(){
		//Party party = new Party();
		//party.setPartyId("3");
		PartyRole partyRole = new PartyRole();
		partyRole.setPartyId("3");
		partyRole.setPartyRoleId("4");
		partyRole.setCreateDate(new Date());
		partyRole.setModifyDate(new Date());
		partyRole.setRoleSpecId("4");
		partyRole.setStatus("U");
		partyRoleDao.addPartyRole(partyRole);
	}

	@Test
	public void getPartyRole(){
		List<PartyRole> partyRole = partyRoleDao.getPartyRolesByPartyId("1");
		//Assert.assertEquals("1", partyRole.);
	}
	
	@Test
	public void updatePartyRole(){
		List<PartyRole> partyRole = partyRoleDao.getPartyRolesByPartyId("1");
		PartyRole role = partyRole.get(0);
		//role.setPartyId("2");
		partyRoleDao.updatePartyRole(role);;
		//Assert.assertEquals("1", partyRole.);
	}
	
	@Test
	public void addPartyName(){
		PartyName partyName = new PartyName();
		partyName.setPartyId("1");
		partyName.setName("Test2");
		partyName.setLanguageType("2");
		partyName.setPartyNameId("5");
		partyName.setCreateDate(new Date());
		partyName.setModifyDate(new Date());
		partyName.setStatus("U");
		partyNameDao.addPartyName(partyName);
	}
}
