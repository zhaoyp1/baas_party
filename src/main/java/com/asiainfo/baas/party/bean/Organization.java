package com.asiainfo.baas.party.bean;

import java.util.Date;

public class Organization extends Party {


	private String organizationId;
	private String name;

	private String legalPerson;

	private int memberNumber;

	private Date foundDate;
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	private Date modifyDate;
	
	private Date createDate;

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
	
	public String toString(){
		System.out.println("========getOrg");
		System.out.println("========getOrg2");
		String str="abc";
		System.out.println(str);
		System.out.println(this.legalPerson);
		return "str";
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getOrg(){
		System.out.println("========getOrg");
		System.out.println("========getOrg2");
	}
}
