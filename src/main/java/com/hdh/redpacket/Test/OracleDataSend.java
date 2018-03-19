package com.hdh.redpacket.Test;

/**
 * oracle数据传输器
 */
public class OracleDataSend implements DataSend {

    private NetConnect netConnect;

    private DataBase dataBase;

    public OracleDataSend(){}

    public OracleDataSend(NetConnect netConnect,DataBase dataBase){
        this.netConnect = netConnect;
        this.dataBase = dataBase;
    }

    /**
     * oracle链接
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
