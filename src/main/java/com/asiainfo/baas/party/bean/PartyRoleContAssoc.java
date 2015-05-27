package com.asiainfo.baas.party.bean;

/**
 * 参与人角色与联系媒介关系
 */
public class PartyRoleContAssoc {

	/**
	 * 关系ID
	 */
	private String partyRoleContId;
	/**
	 * 参与人角色ID
	 */
	private String partyRoleId;
	/**
	 * 联系媒介ID
	 */
	private String contantMediumId;
	/**
	 * 状态
	 */
	private String status;

	public String getPartyRoleContId() {
		return this.partyRoleContId;
	}

	public void setPartyRoleContId(String partyRoleContId) {
		this.partyRoleContId = partyRoleContId;
	}

	public String getPartyRoleId() {
		return this.partyRoleId;
	}

	public void setPartyRoleId(String partyRoleId) {
		this.partyRoleId = partyRoleId;
	}

	public String getContantMediumId() {
		return this.contantMediumId;
	}

	public void setContantMediumId(String contantMediumId) {
		this.contantMediumId = contantMediumId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}