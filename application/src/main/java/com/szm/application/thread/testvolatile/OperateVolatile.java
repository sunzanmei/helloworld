/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.szm.application.thread.testvolatile;

/**
 * @auther sunzanmei
 * @since 16/11/13
 */
public class OperateVolatile {

    private int item = 0;

    private volatile boolean volatileFlag = false;
    private boolean normalFlag = false;


    public void readNormal(){

        if(volatileFlag){
            int i = item;
            System.out.println(Thread.currentThread().getName()+ "readNormal:" + i);

        }

    }

    public void writeNormal(){
        try {
            Thread.currentThread().sleep(10L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.item = 2;
        volatileFlag = true;
    }


//    public void readVolatile(){
//        System.out.println("readNormal : "+volatileItem);
//    }
//
//    public void writeVolatile(){
//        this.volatileItem = 2;
//    }

}
