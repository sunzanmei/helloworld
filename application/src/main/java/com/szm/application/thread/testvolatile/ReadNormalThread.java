/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.szm.application.thread.testvolatile;

/**
 * @auther sunzanmei
 * @since 16/11/13
 */
public class ReadNormalThread extends Thread{

    private OperateVolatile operateVolatile;
    public ReadNormalThread(OperateVolatile operateVolatile){
        this.operateVolatile = operateVolatile;
    }

    @Override
    public void run(){
        operateVolatile.readNormal();
    }
}