package com.asiainfo.baas.party.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.baas.party.bean.ContantMedium;
import com.asiainfo.baas.party.bean.PartyRoleContAssoc;
import com.asiainfo.baas.party.dao.ContantMediumMapper;
import com.asiainfo.baas.party.dao.PartyRoleContAssocMapper;
import com.asiainfo.baas.party.service.ContantMediumService;
import com.asiainfo.baas.party.util.CommonUtil;
import com.asiainfo.baas.party.util.PartyConst;

@Service
public class ContantMediumImpl implements ContantMediumService {

    @Autowired
    private ContantMediumMapper contantMediumMapper;

    @Autowired
    private PartyRoleContAssocMapper partyRoleContAssocMapper;

    /**
     * 
     * @param partyRoleId
     * @param contantMediums
     */
    public boolean saveContantMedium(String partyRoleId, ContantMedium[] contantMediums) {

        if (contantMediums == null || contantMediums.length <= 0) {
            return false;
        }

        // 联系人媒介参与人角色和联系媒介关�?
        PartyRoleContAssoc partyRoleContAssoc = null;
        // 联系媒介
        ContantMedium contantMedium = null;
        // 关系ID
        String partyRoleContId = "";
        // 联系媒介ID
        String contantMediumId = "";
        // 当前时间
        Date now = new Date();

        for (ContantMedium contantMediumValue : contantMediums) {
            partyRoleContId = CommonUtil.getGenerateId();
            contantMediumId = CommonUtil.getGenerateId();

            // 参与人角色和联系媒介关系
            partyRoleContAssoc = new PartyRoleContAssoc();
            partyRoleContAssoc.setPartyRoleContId(partyRoleContId);
            partyRoleContAssoc.setPartyRoleId(partyRoleId);
            partyRoleContAssoc.setContantMediumId(contantMediumId);
            partyRoleContAssoc.setStatus(PartyConst.CommonStatus_1);

            // 联系媒介
            contantMedium = new ContantMedium();
            contantMedium.setContantMediumId(contantMediumId);
            contantMedium.setContantMediumType(contantMediumValue.getContantMediumType());
            contantMedium.setContantMediumValue(contantMediumValue.getContantMediumValue());
            contantMedium.setCreateDate(now);
            contantMedium.setEffectiveDate(now);
            contantMedium.setStatus(PartyConst.CommonStatus_1);

            contantMediumMapper.createContantMedium(contantMedium);
            partyRoleContAssocMapper.createPartyRoleContAssoc(partyRoleContAssoc);

        }
        return true;

    }

    /**
     * 
     * @param contMedCode
     *            ��ϵý�����
     * @param contMedValue
     *            ��У���ֵ
     */
    public boolean validateContantMedium(String contMedCode, String contMedValue) {

        return true;
    }

}