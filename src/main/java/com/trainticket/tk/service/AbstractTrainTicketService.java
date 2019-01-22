package com.trainticket.tk.service;

/**
 * @Author: Frank
 * @Description: 验证码抽象类
 * @Date: Create in  2019/1/21 3:28 PM
 */
public abstract class AbstractTrainTicketService {


    /**
    * @Author: Frank
    * @Description: 发送验证码抽象方法
    * @Date: Create in  2019/1/22 9:11 AM
    * @param tel 手机号
    * @param msg 内容
    * @return:
    */
    public abstract String sendVerificationCode(String tel,String msg);
}
