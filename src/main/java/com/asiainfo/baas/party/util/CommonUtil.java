package com.asiainfo.baas.party.util;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;


public class CommonUtil {
	
	/**
	 * 自动生成ID
	 */
	public static String getGenerateId(){
		return UUID.randomUUID().toString();
	}
	/**
	 * 校验证件信息合法性
	 */
	public static boolean validateIdentification(String identityCode,String identityType){
		return true;
	}

}
