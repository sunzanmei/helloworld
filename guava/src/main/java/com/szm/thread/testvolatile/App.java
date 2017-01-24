/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.szm.thread.testvolatile;

/**
 * @auther sunzanmei
 * @since 16/11/13
 */
public class App {

    public static void main(String[] args) throws InterruptedException {

        for(int i = 0; i < 10000; i++){
            OperateVolatile operateVolatile = new OperateVolatile();
            WriteNormalThread writeThread = new WriteNormalThread(operateVolatile);
            ReadNormalThread readThread = new ReadNormalThread(operateVolatile);
            writeThread.start();
            readThread.start();

//            Thread.currentThread().sleep(1000L);
        }


    }

}
