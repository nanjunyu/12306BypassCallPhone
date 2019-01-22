package com.trainticket.tk.controller;

import com.trainticket.tk.service.AbstractTrainTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Frank
 * @Description: 监听12306Bypass抢票通知
 * @Date: Create in  2019/1/21 3:27 PM
 */

@RestController
@RequestMapping(value = "/trainTicket")
public class TrainTicketController {

    @Autowired
    AbstractTrainTicketService abstractTrainTicketService;

    /**
     * @Author: Frank
     * @Description: 12306Bypass抢票成功回调，如果抢到票12306Bypass会调用次接口，我们在接口里进行电话验证码提醒
     * @Date: Create in  2019/1/21 4:44 PM
     * @params:
     * @return:
     */
    @RequestMapping(value = "/sendCodeFrank", method = RequestMethod.GET)
    public Object sendCode() {
        //异步调用发送语音验证码抽象接口
        abstractTrainTicketService.sendVerificationCode("180000000000", "");
        abstractTrainTicketService.sendVerificationCode("180000000000", "");
        return "success";
    }

}
