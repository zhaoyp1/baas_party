package com.asiainfo.baas.party.bean;

import java.util.*;

/**
 * ��ϵý��
 */
public class ContantMedium {

	private List<PartyRole> partyRoles;
	/**
	 * ��ϵý��ID
	 */
	private String contantMediumId;
	/**
	 * ��ϵý������
	 */
	private String contantMediumType;
	/**
	 * ��ϵý������
	 */
	private String contantMediumValue;
	/**
	 * ״̬
	 */
	private String status;
	/**
	 * ��������
	 */
	private Date createDate;
	/**
	 * ��Чʱ��
	 */
	private Date effectiveDate;
	/**
	 * ʧЧʱ��
	 */
	private Date expireDate;

	public List<PartyRole> getPartyRoles() {
		return this.partyRoles;
	}

	public void setPartyRoles(List<PartyRole> partyRoles) {
		this.partyRoles = partyRoles;
	}

	public String getContantMediumId() {
		return this.contantMediumId;
	}

	public void setContantMediumId(String contantMediumId) {
		this.contantMediumId = contantMediumId;
	}

	public String getContantMediumType() {
		return this.contantMediumType;
	}

	public void setContantMediumType(String contantMediumType) {
		this.contantMediumType = contantMediumType;
	}

	public String getContantMediumValue() {
		return this.contantMediumValue;
	}

	public void setContantMediumValue(String contantMediumValue) {
		this.contantMediumValue = contantMediumValue;
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

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

}