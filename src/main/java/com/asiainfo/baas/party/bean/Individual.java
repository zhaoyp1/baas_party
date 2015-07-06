package com.asiainfo.baas.party.bean;

import java.util.Date;

public class Individual extends Party {

	/**
	 * ����ID
	 */

	private String individualId;
	private String name;


	/**
	 * �Ա�
	 */
	private String sex;
	/**
	 * ��������
	 */
	private Date birthday;
	/**
	 * �޸�ʱ��
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
