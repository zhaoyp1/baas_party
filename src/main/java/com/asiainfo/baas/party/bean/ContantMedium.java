package com.asiainfo.baas.party.bean;

import java.util.Date;
 
public class ContantMedium {

	 
	private String contantMediumId1;

	private String contantMediumType23;
	 
	private String contantMediumValue;
	 
	private String status;
	 
	private Date createDate;
	 
	private Date effectiveDate;
	 
	private Date expireDate;

	public String toString(){
		return "abc" ;
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
