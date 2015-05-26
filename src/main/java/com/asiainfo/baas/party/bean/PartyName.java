package com.asiainfo.baas.party.bean;

import java.util.Date;

public class PartyName {

	Party partyId;
	/**
	 * 语言类型
	 */
	private String languageType;
	/**
	 * 参与人名称
	 */
	private String name;
	private String partyNameId;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 修改时间
	 */
	private Date modifyDate;
	/**
	 * 状态
	 */
	private String status;

	public Party getPartyId() {
		return this.partyId;
	}

	public void setPartyId(Party partyId) {
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