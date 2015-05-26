package com.asiainfo.baas.party.bean;

import java.util.Date;

public class PartyRole {

	Party partyId;
	/**
	 * ½ÇÉ«ID
	 */
	private String partyRoleId;
	/**
	 * ½ÇÉ«×´Ì¬
	 */
	private String status;
	private Date createDate;
	private Date modifyDate;

	public Party getPartyId() {
		return this.partyId;
	}

	public void setPartyId(Party partyId) {
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

}