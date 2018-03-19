package com.hdh.redpacket.Test;

/**
 * oracle数据库
 */
public class Oracle implements DataBase{
    @Override
    public void dbConn(DataBase dataBase) {
        System.out.println("Oracle dbConn");
    }
}
