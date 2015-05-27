package com.asiainfo.baas.party.bean;

import java.util.Date;
import java.util.*;

public class PartyRole {

	private String partyId;
	
	/**
	 * ��ɫID
	 */
	private String partyRoleId;
	/**
	 * ��ɫ״̬
	 */
	private String status;
	private java.util.Date createDate;
	private java.util.Date modifyDate;
	private String roleSpecId;
	private List<ContantMedium> contantMediums;

	public String getPartyId() {
		return this.partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public void setPartyRoleId(String partyRoleId) {
		this.partyRoleId = partyRoleId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public java.util.Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}

	public java.util.Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(java.util.Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getRoleSpecId() {
		return this.roleSpecId;
	}

	public void setRoleSpecId(String roleSpecId) {
		this.roleSpecId = roleSpecId;
	}

	public List<ContantMedium> getContantMediums() {
		return this.contantMediums;
	}

	public void setContantMediums(List<ContantMedium> comtantMediums) {
		this.contantMediums = comtantMediums;
	}

}