package com.asiainfo.baas.party.bean;

/**
 * �����˽�ɫ����ϵý���ϵ
 */
public class PartyRoleContAssoc {

	/**
	 * ��ϵID
	 */
	private String partyRoleContId;
	/**
	 * �����˽�ɫID
	 */
	private String partyRoleId;
	/**
	 * ��ϵý��ID
	 */
	private String contantMediumId;
	/**
	 * ״̬
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