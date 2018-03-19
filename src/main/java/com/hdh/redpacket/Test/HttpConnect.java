package com.hdh.redpacket.Test;

/**
 * http协议链接
 */
public class HttpConnect implements NetConnect {
    @Override
    public void transConn(NetConnect netConnect) {
        System.out.println("http connect");
    }
}
