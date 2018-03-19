package com.hdh.redpacket.Test;

/**
 * mysql数据传输器
 */
public class MySqlDataSend implements DataSend {

    private NetConnect netConnect;

    private DataBase dataBase;

    public MySqlDataSend(){}

    public MySqlDataSend(NetConnect netConnect,DataBase dataBase){
        this.netConnect = netConnect;
        this.dataBase = dataBase;
    }

    /**
     * mysql链接
     */
    public void dbConn(){
        dataBase.dbConn(dataBase);
    }

    /**
     * 处理
     */
    @Override
    public void due() {
        System.out.println("mysql 处理 ");
    }

    /**
     * 协议链接
     */
    public void transConn(){
        this.netConnect.transConn(netConnect);
    }
}
