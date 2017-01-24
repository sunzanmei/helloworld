/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.szm.thread.testvolatile;

/**
 * @auther sunzanmei
 * @since 16/11/13
 */
public class WriteNormalThread extends Thread{

    private OperateVolatile operateVolatile;
    public WriteNormalThread(OperateVolatile operateVolatile){
        this.operateVolatile = operateVolatile;
    }

    @Override
    public void run(){
        operateVolatile.writeNormal();
    }
}
