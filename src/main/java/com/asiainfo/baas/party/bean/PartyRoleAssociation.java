package com.asiainfo.baas.party.bean;

import java.util.Date;

public class PartyRoleAssociation {

	/**
	 * ��ϵID
	 */
	private String associationId;
	/**
	 * ����
	 */
	private String associationType;
	/**
	 * �����ɫID
	 */
	private String partyRoleId;
	/**
	 * ���������ɫID
	 */
	private String relPartyRoleId;
	/**
	 * ״̬
	 */
	private String status;
	/**
	 * ����ʱ��
	 */
	private Date createDate;
	/**
	 * �޸�ʱ��
	 */
	private Date modifyDate;

	public String getAssociationId() {
		return this.associationId;
	}

	public void setAssociationId(String associationId) {
		this.associationId = associationId;
	}

	public String getAssociationType() {
		return this.associationType;
	}

	public void setAssociationType(String associationType) {
		this.associationType = associationType;
	}

	public String getPartyRoleId() {
		return this.partyRoleId;
	}

	public void setPartyRoleId(String partyRoleId) {
		this.partyRoleId = partyRoleId;
	}

	public String getRelPartyRoleId() {
		return this.relPartyRoleId;
	}

	public void setRelPartyRoleId(String relPartyRoleId) {
		this.relPartyRoleId = relPartyRoleId;
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