package com.trainticket.tk.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.trainticket.tk.service.AbstractTrainTicketService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.io.IOException;

import static com.trainticket.tk.utils.SendCode163.sendCode;

/**
 * @Author: Frank
 * @Description: 实现网易云信验证码
 * @Date: Create in  2019/1/21 3:29 PM
 */
@Service
public class TrainTicketServiceBy163Impl extends AbstractTrainTicketService {

    @Override
    @Async
    public String sendVerificationCode(String tel, String msg) {
        JSONObject object=new JSONObject();
        try {
            object=sendCode(tel);
            if(object.getInteger("code")==200){
                System.out.println("验证码发送成功");
            }else {
                System.out.println("验证码发送失败:"+object.toJSONString());
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("验证码发送失败"+object.toJSONString());
        }
        return JSON.toJSONString(object);
    }
}
