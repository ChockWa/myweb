package com.hdh.redpacket.sms;

/**
 * 通知接口
 */
public interface Notice {
    // 检查发送限制
    void checkSendTimes();
}
