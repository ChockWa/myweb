package com.hdh.redpacket.sms;

/**
 * 具体通道1
 */
public class Channel1 extends Channel {

    public Channel1(Notice notice) {
        super();
        super.notice = notice;
    }

    private static int failTimes = 0;

    /**
     * 检查错误次数
     * @return
     */
    @Override
    boolean checkFailTimeIsOverMax() {
        if(failTimes >= MAX_FAILTIMES){
            return true;
        }
        return false;
    }

    /**
     * 关闭通道
     * @param notice
     */
    @Override
    void closeChannel(Notice notice) {

    }

    /**
     * 发送前特殊处理
     * @param notice
     */
    @Override
    void beforeSendDue(Notice notice) {
        // 可处理白名单黑名单
    }

    /**
     * 发送
     * @param notice
     */
    @Override
    void Send(Notice notice) {
        // 检查发送限制
        notice.checkSendTimes();
    }
}
