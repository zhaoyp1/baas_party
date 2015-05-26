package com.asiainfo.baas.party.bean;

import java.util.Date;

public class Organization extends Party {

	/**
	 * 组织ID
	 */
	private String organizationId;
	/**
	 * 法人名称
	 */
	private String legalPerson;
	/**
	 * 成员人数
	 */
	private int memberNumber;
	/**
	 * 创建时间
	 */
	private Date foundDate;
	/**
	 * 修改时间
	 */
	private Date modifyDate;

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public String getLegalPerson() {
		return this.legalPerson;
	}

	public void setLegalPerson(String legalPerson) {
		this.legalPerson = legalPerson;
	}

	public int getMemberNumber() {
		return this.memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public Date getFoundDate() {
		return this.foundDate;
	}

	public void setFoundDate(Date foundDate) {
		this.foundDate = foundDate;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

}