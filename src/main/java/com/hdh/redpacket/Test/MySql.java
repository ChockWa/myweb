package com.hdh.redpacket.Test;

/**
 * mysql数据库
 */
public class MySql implements DataBase {
    @Override
    public void dbConn(DataBase dataBase) {
        System.out.println("MySql dbConn");
    }
}
