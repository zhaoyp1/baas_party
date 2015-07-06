package com.asiainfo.baas.party.bean;

import java.util.Date;

public class PartyName {

	private String partyId;
	 
	private String languageType;
	 
	private String name;
	private String partyNameId;
	 
	private Date createDate;
	 
	private Date modifyDate;
	/**
	 * ״̬
	 */
	private String status;

	public String getPartyId() {
		return this.partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getLanguageType() {
		return this.languageType;
	}

	public void setLanguageType(String languageType) {
		this.languageType = languageType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPartyNameId() {
		return this.partyNameId;
	}

	public void setPartyNameId(String partyNameId) {
		this.partyNameId = partyNameId;
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}