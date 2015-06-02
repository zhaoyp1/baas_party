package com.asiainfo.baas.party.bean;

import java.util.Date;

public class Individual extends Party {

	/**
	 * 个人ID
	 */
	private String individualIdac;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 出生日期
	 */
	private Date birthday;
	/**
	 * 修改时间
	 */
	private Date modifyDate;
	
	private Date createDate;

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getIndividualId() {
		return this.individualId;
	}

	public void setIndividualId(String individualId) {
		this.individualId = individualId;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

}