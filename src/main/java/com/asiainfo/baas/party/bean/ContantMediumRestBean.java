package com.asiainfo.baas.party.bean;

import java.util.List;

/**
 * ��ϵý��
 */
public class ContantMediumRestBean {

    private String partyRoleId;

    private List<ContantMedium> ContantMediums;

    public String getPartyRoleId() {
        return partyRoleId;
    }

    public void setPartyRoleId(String partyRoleId) {
        this.partyRoleId = partyRoleId;
    }

    public List<ContantMedium> getContantMediums() {
        return ContantMediums;
    }

    public void setContantMediums(List<ContantMedium> contantMediums) {
        ContantMediums = contantMediums;
    }

}