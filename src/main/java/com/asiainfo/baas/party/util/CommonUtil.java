package com.asiainfo.baas.party.util;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;


public class CommonUtil {
	
	 
	public static String getGenerateId(){
		return UUID.randomUUID().toString();
	}
	 
	public static boolean validateIdentification(String identityCode,String identityType){
		return true;
	}

}
