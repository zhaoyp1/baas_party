package com.asiainfo.baas.party.bean;

import java.util.Date;

public class PartyRoleAssociation {

	/**
	 * 关系ID
	 */
	private String associationId;
	/**
	 * 类型
	 */
	private String associationType;
	/**
	 * 参与角色ID
	 */
	private String partyRoleId;
	/**
	 * 关联参与角色ID
	 */
	private String relPartyRoleId;
	/**
	 * 状态
	 */
	private String status;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 修改时间
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