package com.asiainfo.baas.party.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.asiainfo.baas.party.bean.ContantMedium;
import com.asiainfo.baas.party.service.ContantMediumService;

@RunWith(SpringJUnit4ClassRunner.class)
// 整合
@ContextConfiguration(locations = "classpath:applicationContext.xml")
// 加载配置
public class TestContantMediumService {

    @Autowired
    private ContantMediumService ContantMediumService;

    @Test
    public void testSaveContantMedium() {

        ContantMedium contantMediums[] = new ContantMedium[2];
        // 1:手机号
        ContantMedium contantMedium1 = new ContantMedium();
        contantMedium1.setContantMediumType("1");
        contantMedium1.setContantMediumValue("13211111111");
        contantMediums[0] = contantMedium1;
        // 2：邮箱
        ContantMedium contantMedium2 = new ContantMedium();
        contantMedium2.setContantMediumType("2");
        contantMedium2.setContantMediumValue("liuwei29@asiainfo.com");
        contantMediums[1] = contantMedium2;

        boolean a = ContantMediumService.saveContantMedium("23f19cd9-f795-4c60-b60c-b79002b97f03", contantMediums);
        System.out.println(a);

    }

}
