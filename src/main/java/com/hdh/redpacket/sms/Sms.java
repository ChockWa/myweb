package com.hdh.redpacket.sms;

/**
 * 短信类型通知
 */
public class Sms implements Notice{
    @Override
    public void checkSendTimes() {
        System.out.println("实现发送次数校验");
    }
}
