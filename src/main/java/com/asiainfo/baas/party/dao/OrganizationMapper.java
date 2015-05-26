package com.asiainfo.baas.party.dao;

import java.util.List;

import com.asiainfo.baas.party.bean.Organization;

public interface OrganizationMapper {
	public List<Organization> getOrganizationList();
	
	public void addOrganization(Organization organization);
	
	public Organization getOrganizationById(String organizationId);
	
	public void updateOrganization(Organization organization);
	
	
}
