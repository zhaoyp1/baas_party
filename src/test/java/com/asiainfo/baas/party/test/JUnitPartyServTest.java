package com.asiainfo.baas.party.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.asiainfo.baas.party.bean.Individual;
import com.asiainfo.baas.party.bean.Party;
import com.asiainfo.baas.party.bean.PartyIdentification;
import com.asiainfo.baas.party.bean.PartyName;
import com.asiainfo.baas.party.service.PartyService;
import com.asiainfo.baas.party.util.CommonUtil;
import com.asiainfo.baas.party.util.PartyConst;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations="classpath:applicationContext.xml") 
public class JUnitPartyServTest {
	@Autowired
	private PartyService partySV;
	/**
	 * 添加party
	 */
	@Test
	public void addParty(){
		Party party = new Party();
		party.setLoginName("addtestliu2");
		party.setPassword("123456");
		party.setPartyType(PartyConst.partyTypeIndividual);
		partySV.createParty(party);
	}
	
	/**
	 * 完善订户信息
	 */
	@Test
	public void doOrderInfo(){
		try {
			Individual individual = new Individual();
			SimpleDateFormat sdf =   new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
			individual.setSex("1");
			individual.setBirthday(sdf.parse("1990-02-23 00:00:00"));
			individual.setModifyDate(new Date());
			individual.setIndividualId("27903ad1-7519-4c44-97ad-95f170c96ec1");
			
			PartyIdentification identification = new PartyIdentification();
			identification.setCertEffdate(sdf.parse("2000-02-23 00:00:00"));
			identification.setCertExpireDate(sdf.parse("2016-02-23 00:00:00"));
			identification.setCreateDate(new Date());
			identification.setIdentityCode("123456789qwer");
			identification.setIdentityType("2");
			identification.setModityDate(new Date());
			identification.setPartyId("27903ad1-7519-4c44-97ad-95f170c96ec1");
			
			PartyName partyName = new PartyName();
			partyName.setCreateDate(new Date());
			partyName.setModifyDate(new Date());
			partyName.setLanguageType("1");
			partyName.setName("刘测试");
			partyName.setPartyId("27903ad1-7519-4c44-97ad-95f170c96ec1");
			//修改个人订户信息
			partySV.modifyIndividual(individual);
			//保存partyName
			partySV.createPartyName(partyName);
			if(CommonUtil.validateIdentification(identification.getIdentityCode(), identification.getIdentityType())){
				//保存证件信息
				partySV.saveIdentification(identification);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
