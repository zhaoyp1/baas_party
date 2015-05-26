package com.asiainfo.baas.party.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.asiainfo.baas.party.bean.Organization;
import com.asiainfo.baas.party.dao.OrganizationMapper;
import com.asiainfo.baas.party.util.CommonUtil;

@RunWith(SpringJUnit4ClassRunner.class) // ’˚∫œ 
@ContextConfiguration(locations="classpath:applicationContext.xml") // º”‘ÿ≈‰÷√

public class TestOrganizationUnit {
	
	@Autowired
	private OrganizationMapper organizeDao;
	
	@Test
	public void testGetOrganization(){
		List<Organization>organizationList=organizeDao.getOrganizationList();
		
		
	}
	
	@Test
	public void testCreateOrganization(){
		Organization org=new Organization();
		org.setOrganizationId(CommonUtil.getGenerateId());
		org.setFoundDate(new Date());
		org.setLegalPerson("’‘‘∆∆º");
		org.setMemberNumber(3);
		organizeDao.addOrganization(org);
		
		
	}
	
	@Test
	public void testQueryOrganization(){
		Organization org=new Organization();
//		org.setOrganizationId(CommonUtil.getGenerateId());
//		org.setFoundDate(new Date());
//		org.setLegalPerson("’‘‘∆∆º");
//		org.setMemberNumber(3);
		org=organizeDao.getOrganizationById("18a377ed-c732-4a72-af37-5b6a83ca3ee2");
		
		
	}
	
	
}
