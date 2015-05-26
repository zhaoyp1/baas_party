package com.asiainfo.baas.party.util;

import java.util.UUID;

public class CommonUtil {
	
	public static String getGenerateId(){
		return UUID.randomUUID().toString();
	}

}
