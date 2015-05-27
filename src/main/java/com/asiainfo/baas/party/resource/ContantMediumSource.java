package com.asiainfo.baas.party.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.baas.party.bean.ContantMedium;
import com.asiainfo.baas.party.bean.ContantMediumRestBean;
import com.asiainfo.baas.party.service.ContantMediumService;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

@Service
@Path("/contantMedium")
public class ContantMediumSource {

    @Autowired
    private ContantMediumService contantMediumService;

    // @POST
    // @Path("/contantMedium")
    // @Consumes({ "application/json", "application/xml" })
    // public String saveContantMedium(Map inputParam) {
    // String partyRoleId = (String) inputParam.get("partyRoleId");
    // List list = (List) inputParam.get("contantMediums");
    //
    // ContantMedium[] contantMediums = new ContantMedium[list.size()];
    // for (int i = 0; i < list.size(); i++) {
    // Map contantMediumMap = (Map) list.get(i);
    // ContantMedium contantMedium = new ContantMedium();
    // contantMedium.setContantMediumType((String)
    // contantMediumMap.get("contantMediumType"));
    // contantMedium.setContantMediumValue((String)
    // contantMediumMap.get("contantMediumValue"));
    // contantMediums[i] = contantMedium;
    // }
    //
    // JSONObject result = new JSONObject();
    //
    // boolean flag = contantMediumService.saveContantMedium(partyRoleId,
    // contantMediums);
    //
    // if (flag) {
    // result.put("code", "1");
    // result.put("mseg", "OK");
    // } else {
    // result.put("code", "2");
    // result.put("mseg", "创建新联系人失败");
    // }
    //
    // return result.toString();
    // }

    @POST
    @Path("/contantMedium")
    @Consumes({ "application/json", "application/xml" })
    public String saveContantMedium(ContantMediumRestBean bean) {
        String partyRoleId = bean.getPartyRoleId();
        List<ContantMedium> list = bean.getContantMediums();

        ContantMedium[] contantMediums = (ContantMedium[]) list.toArray(new ContantMedium[0]);

        JSONObject result = new JSONObject();

        boolean flag = contantMediumService.saveContantMedium(partyRoleId, contantMediums);

        if (flag) {
            result.put("code", "1");
            result.put("mseg", "OK");
        } else {
            result.put("code", "2");
            result.put("mseg", "创建新联系人失败");
        }

        return result.toString();
    }

}
