package com.asiainfo.baas.party.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.baas.party.bean.ContantMedium;
import com.asiainfo.baas.party.service.ContantMediumService;

@Service
@Path("/contantMedium")
public class ContantMediumSource {

    @Autowired
    private ContantMediumService contantMediumService;

    @POST
    @Path("/contantMedium")
    @Consumes({ "application/json", "application/xml" })
    public String saveContantMedium(String partyRoleId, ContantMedium[] contantMediums) {
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
