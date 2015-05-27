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
			mseg="参数不合法";
		}else{
			String loginName=party.getLoginName();
			boolean flag=partyService.validateLoginName(party);
			if(!flag){
				code="500";
				mseg="登录名不符合格式规则";
				
			}else{
				
				 flag=partyService.checkLoginNameUniqueness(loginName);
				if(flag){
					partyService.createParty(party);
					code="200";
					mseg="OK";
				}else{
					code="500";
					mseg="登录名已存在";
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
			//修改个人订户信息
			partyService.modifyIndividual(individual);
			//保存partyName
			partyService.createPartyName(partyName);
			if(CommonUtil.validateIdentification(identification.getIdentityCode(), identification.getIdentityType())){
				//保存证件信息
				partyService.saveIdentification(identification);
			}
		}else{
			code = "500";
			mseg = "完善信息失败！";
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
			//修改组织订户信息
			partyService.modifyOrganization(organization);
			//保存partyName
			partyService.createPartyName(partyName);
			if(CommonUtil.validateIdentification(identification.getIdentityCode(), identification.getIdentityType())){
				//保存证件信息
				partyService.saveIdentification(identification);
			}
		}else{
			code = "500";
			mseg = "完善信息失败！";
		}
		result.put("CODE", code);
		result.put("MSEG", mseg);
		return result.toString();
	}

}
