package com.asiainfo.baas.party.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.baas.party.bean.Individual;
import com.asiainfo.baas.party.bean.Organization;
import com.asiainfo.baas.party.bean.Party;
import com.asiainfo.baas.party.bean.PartyIdentification;
import com.asiainfo.baas.party.bean.PartyName;
import com.asiainfo.baas.party.bean.PerfectBean;
import com.asiainfo.baas.party.service.PartyService;
import com.asiainfo.baas.party.util.CommonUtil;

@Service
@Path("/party")
public class PartySource {
	
	@Autowired
	private PartyService partyService;
	
	
	@POST
	@Consumes({ "application/json", "application/xml" })
	public String registParty(Party party){
		JSONObject result=new JSONObject();
		String code="";
		String mseg="";
		
		if(party==null||"".equals(party.getLoginName())||"".equals(party.getPassword())||"".equals(party.getPartyType())){
			code="500";
			mseg="�������Ϸ�";
		}else{
			String loginName=party.getLoginName();
			boolean flag=partyService.validateLoginName(party);
			if(!flag){
				code="500";
				mseg="��¼�������ϸ�ʽ����";
				
			}else{
				
				 flag=partyService.checkLoginNameUniqueness(loginName);
				if(flag){
					partyService.createParty(party);
					code="200";
					mseg="OK";
				}else{
					code="500";
					mseg="��¼���Ѵ���";
				}
			}
		}
		result.put("CODE", code);
		result.put("MSEG", mseg);
		return result.toString();
	}
	
	@POST
	@Path("/individual")
	@Consumes({ "application/json", "application/xml" })
	public String perfectIndividual(PerfectBean perfectBean){
		JSONObject result=new JSONObject();
		String code="200";
		String mseg="OK";
		if(perfectBean != null){
			Individual individual = perfectBean.getIndividual();
			
			PartyIdentification identification = perfectBean.getPartyIdentification();
			
			PartyName partyName = perfectBean.getPartyName();
			//�޸ĸ��˶�����Ϣ
			partyService.modifyIndividual(individual);
			//����partyName
			partyService.createPartyName(partyName);
			if(CommonUtil.validateIdentification(identification.getIdentityCode(), identification.getIdentityType())){
				//����֤����Ϣ
				partyService.saveIdentification(identification);
			}
		}else{
			code = "500";
			mseg = "������Ϣʧ�ܣ�";
		}
		
		result.put("CODE", code);
		result.put("MSEG", mseg);
		return result.toString();
		
	}
	
	@POST
	@Path("/organization")
	@Consumes({ "application/json", "application/xml" })
	public String perfectOrganization(PerfectBean perfectBean){
		JSONObject result=new JSONObject();
		String code="200";
		String mseg="OK";
		if(perfectBean != null){
			Organization organization = perfectBean.getOrganization();
			
			PartyIdentification identification = perfectBean.getPartyIdentification();
			
			PartyName partyName = perfectBean.getPartyName();
			//�޸���֯������Ϣ
			partyService.modifyOrganization(organization);
			//����partyName
			partyService.createPartyName(partyName);
			if(CommonUtil.validateIdentification(identification.getIdentityCode(), identification.getIdentityType())){
				//����֤����Ϣ
				partyService.saveIdentification(identification);
			}
		}else{
			code = "500";
			mseg = "������Ϣʧ�ܣ�";
		}
		result.put("CODE", code);
		result.put("MSEG", mseg);
		return result.toString();
	}

}
