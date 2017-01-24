/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.szm.application.thread;

/**
 * @auther sunzanmei
 * @date 16/11/19
 */
public class ThreadStatus extends Thread{
//    public static Hell
    private static volatile boolean runStatus = true;
    @Override
    public void run(){
        try {
            System.out.println("thread sleep");
            Thread.currentThread().sleep(1000);
            System.out.println("thread awake");

            while(runStatus){
                int i = 0;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadStatus threadStatus = new ThreadStatus();
        System.out.println("new :"+ (threadStatus.getState().name()));

        threadStatus.start();
        ThreadStatus.currentThread().sleep(100);
        System.out.println("sleep : "+ (threadStatus.getState().name()));

        ThreadStatus.currentThread().sleep(3 * 1000);
        System.out.println("start : " + (threadStatus.getState().name()));

        runStatus = false;
        ThreadStatus.currentThread().sleep(100);
        System.out.println("end:"+ (threadStatus.getState().name()));
    }
}
