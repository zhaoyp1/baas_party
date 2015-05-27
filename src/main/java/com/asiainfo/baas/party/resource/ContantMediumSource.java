package com.asiainfo.baas.party.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.baas.party.bean.ContantMedium;
import com.asiainfo.baas.party.bean.ContantMediumRestBean;
import com.asiainfo.baas.party.service.ContantMediumService;

@Service
@Path("/contantMedium")
public class ContantMediumSource {

    @Autowired
    private ContantMediumService contantMediumService;


    @POST
    @Path("/contantMedium")
    @Consumes({ "application/json", "application/xml" })
    public String saveContantMedium(ContantMediumRestBean bean) {
        JSONObject result = new JSONObject();

        if (bean == null || StringUtils.isEmpty(bean.getPartyRoleId()) || bean.getContantMediums() == null) {
            result.put("code", "500");
            result.put("mseg", "参数不合法！");
        }

        String partyRoleId = bean.getPartyRoleId();
        List<ContantMedium> list = bean.getContantMediums();

        ContantMedium[] contantMediums = (ContantMedium[]) list.toArray(new ContantMedium[0]);

        for (ContantMedium contantMedium : contantMediums) {
            if (StringUtils.isEmpty(contantMedium.getContantMediumType())
                    || StringUtils.isEmpty(contantMedium.getContantMediumValue())) {
                result.put("code", "500");
                result.put("mseg", "参数不合法！");
            }
        }

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
