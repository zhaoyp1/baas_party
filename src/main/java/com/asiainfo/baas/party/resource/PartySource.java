package com.asiainfo.baas.party.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.baas.party.bean.Party;
import com.asiainfo.baas.party.service.PartyService;

@Service
@Path("/party")
public class PartySource {
	
	@Autowired
	private PartyService partyService;
	
	
	@POST
	@Path("/party")
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
					code="0";
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

}
