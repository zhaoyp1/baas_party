package com.asiainfo.baas.party.dao;

import com.asiainfo.baas.party.bean.ContantMedium;

public interface ContantMediumMapper {
	 
	public void deleteContantMediumById(String contactMediumId);

	 
	public void createContantMedium(ContantMedium contantMedium);

	 
	public ContantMedium getContantMediumById(String contactMediumId);

	 
	public void updateContantMediumById(ContantMedium contantMedium);
}
