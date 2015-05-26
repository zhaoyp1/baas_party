package com.asiainfo.baas.party.test;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.asiainfo.baas.party.bean.Party;
import com.asiainfo.baas.party.dao.PartyMapper;
import com.asiainfo.baas.party.util.CommonUtil;

@RunWith(SpringJUnit4ClassRunner.class) // ’˚∫œ 
@ContextConfiguration(locations="classpath:applicationContext.xml") // º”‘ÿ≈‰÷√
public class TestUnit {
	
	@Autowired
	private PartyMapper partyDao;
	
	@Test
	public void testPartyDao(){
		List<Party> party=partyDao.getPartyList();
		Assert.assertNull(party);
	}
	@Test
	public void createPartyDao(){
		Party party=new Party();
		party.setCreateDate(new Date());
		party.setLoginName("111");
		party.setPartyId(CommonUtil.getGenerateId());
		party.setPassword("111");
		party.setStatus("1");
		partyDao.addParty(party);
	}
	@Test
	public void getPartyByIdDao(){
		Party party=new Party();
		party.setPartyId("31bb7f79-5efc-43b5-ab61-1c5e08373fa2");
		partyDao.getPartyById("31bb7f79-5efc-43b5-ab61-1c5e08373fa2");
	}
	
	@Test
	public void updateParty(){
		Party party=partyDao.getPartyById("31bb7f79-5efc-43b5-ab61-1c5e08373fa2");
		party.setLoginName("zhaoyp");
		partyDao.updateParty(party);
	}
	@Test
	public void delParty(){
		Party party=partyDao.getPartyById("31bb7f79-5efc-43b5-ab61-1c5e08373fa2");
		party.setLoginName("zhaoyp");
		partyDao.delParty("31bb7f79-5efc-43b5-ab61-1c5e08373fa2");
	}

}
