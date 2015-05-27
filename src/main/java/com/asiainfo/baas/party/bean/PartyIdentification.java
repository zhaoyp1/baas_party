package com.asiainfo.baas.party.bean;

import java.util.Date;

public class PartyIdentification {

	private String partyIdentityId;
	/**
	 * 证件号
	 */
	private String identityCode;
	/**
	 * 证件类型
	 */
	private String identityType;
	
	private String partyId;
	private Date createDate;
	private Date modityDate;
	/**
	 * 签发日期
	 */
	private Date certEffdate;
	/**
	 * 失效日期
	 */
	private Date certExpireDate;

	public String getPartyIdentityId() {
		return this.partyIdentityId;
	}

	public void setPartyIdentityId(String party_identity_id) {
		this.partyIdentityId = party_identity_id;
	}

	public String getIdentityCode() {
		return this.identityCode;
	}

	public void setIdentityCode(String code) {
		this.identityCode = code;
	}

	public String getIdentityType() {
		return this.identityType;
	}

	public void setIdentityType(String identity_type) {
		this.identityType = identity_type;
	}

	public String getPartyId() {
		return this.partyId;
	}

	public void setPartyId(String party_id) {
		this.partyId = party_id;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModityDate() {
		return this.modityDate;
	}

	public void setModityDate(Date modityDate) {
		this.modityDate = modityDate;
	}

	public Date getCertEffdate() {
		return this.certEffdate;
	}

	public void setCertEffdate(Date certEffdate) {
		this.certEffdate = certEffdate;
	}

	public Date getCertExpireDate() {
		return this.certExpireDate;
	}

	public void setCertExpireDate(Date certExpireDate) {
		this.certExpireDate = certExpireDate;
	}

}