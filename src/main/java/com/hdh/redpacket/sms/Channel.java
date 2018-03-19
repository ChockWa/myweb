package com.hdh.redpacket.sms;

/**
 * 通道抽象类
 */
public abstract class Channel {
    // 通知类型
    protected Notice notice;
    // 最大失败次数
    protected static int MAX_FAILTIMES = 10;
    // 检查错误次数是否大于最大失败次数
    abstract boolean checkFailTimeIsOverMax();
    // 关闭通道
    abstract void closeChannel(Notice notice);
    // 发送短信前特殊处理
    abstract void beforeSendDue(Notice notice);
    // 发送短信
    abstract void Send(Notice notice);
}
