package com.asiainfo.baas.party.dao;

import com.asiainfo.baas.party.bean.ContantMedium;

public interface ContantMediumMapper {
	/**
	 * 根据contactMediumId删除一个联系媒介
	 */
	public void deleteContantMediumById(String contactMediumId);

	/**
	 * 新增一个联系媒介
	 */
	public void createContantMedium(ContantMedium contantMedium);

	/**
	 * 查询联系媒介
	 */
	public ContantMedium getContantMediumById(String contactMediumId);

	/**
	 * 修改联系媒介
	 */
	public void updateContantMediumById(ContantMedium contantMedium);
}
