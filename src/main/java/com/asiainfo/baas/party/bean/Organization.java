package com.asiainfo.baas.party.bean;

import java.util.Date;

public class Organization extends Party {

	/**
	 * ��֯ID
	 */
	private String organizationId;
	/**
	 * ��������
	 */
	private String legalPerson;
	/**
	 * ��Ա����
	 */
	private int memberNumber;
	/**
	 * ����ʱ��
	 */
	private Date foundDate;
	/**
	 * �޸�ʱ��
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