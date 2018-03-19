package com.hdh.redpacket.Test;

/**
 * ftp协议链接
 */
public class FtpConnect implements NetConnect {
    @Override
    public void transConn(NetConnect netConnect) {
        System.out.println("ftp connect");
    }
}
