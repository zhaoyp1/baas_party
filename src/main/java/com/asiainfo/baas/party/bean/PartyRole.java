package com.asiainfo.baas.party.bean;

import java.util.Date;

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
	private Date createDate;
	private Date modifyDate;
	private String roleSpecId;

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

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getRoleSpecId() {
		return this.roleSpecId;
	}

	public void setRoleSpecId(String roleSpecId) {
		this.roleSpecId = roleSpecId;
	}

}