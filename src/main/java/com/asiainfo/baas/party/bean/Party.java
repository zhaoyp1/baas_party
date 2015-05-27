package com.asiainfo.baas.party.bean;

import java.util.*;

public class Party {

	/**
	 * 角色
	 */
	private List<PartyRole> partyRoles;
	private List<PartyName> partyNames;
	/**
	 * 参与人ID
	 */
	private String partyId;
	/**
	 * 登录账号
	 */
	private String loginName;
	/**
	 * 登录密码
	 */
	private String password;
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
	/**
	 * 参与人类行：个人或企业
	 */
	private String partyType;
	
	private List<PartyIdentification> partyIdentifications;

	public List<PartyRole> getPartyRoles() {
		return this.partyRoles;
	}

	public void setPartyRoles(List<PartyRole> partyRoles) {
		this.partyRoles = partyRoles;
	}

	public List<PartyName> getPartyNames() {
		return this.partyNames;
	}

	public void setPartyNames(List<PartyName> partyNames) {
		this.partyNames = partyNames;
	}

	public String getPartyId() {
		return this.partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getPartyType() {
		return this.partyType;
	}

	public void setPartyType(String partyType) {
		this.partyType = partyType;
	}

	public List<PartyIdentification> getPartyIdentifications() {
		return this.partyIdentifications;
	}

	public void setPartyIdentifications(List<PartyIdentification> partyIdentifications) {
		this.partyIdentifications = partyIdentifications;
	}

}