/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.szm.thread;

/**
 * @auther sunzanmei
 * @date 16/11/22
 */
public class InterruptTest {

    public static class InterruptedThread extends Thread{
        @Override
        public void run(){
            System.out.println("thread start");
            try {
                Thread.currentThread().sleep(10000);
                System.out.println("thread run well");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread end");
        }
    }


    public static void main(String[] args) {
        InterruptedThread thread = new InterruptedThread();

//        interrupt(thread);
        whileWithInterrupt(thread);
        System.out.println("main end");
    }

    private static void interrupt(InterruptedThread interruptedThread){
        interruptedThread.start();

        try {
            Thread.currentThread().sleep(100);
        } catch (InterruptedException e) {
            System.out.println("main interrupted");
        }
        System.out.println("thread.interrupt");
        interruptedThread.interrupt();
    }

    private static void whileWithInterrupt(InterruptedThread interruptedThread){
        interruptedThread.start();
        int i = 0;
        while (i < 100) {
//            if(interruptedThread.isInterrupted()){
//                System.out.println("interrupt 标志已经置位");
//            }
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                System.out.println("main interrupted");
            }
            i++;
        }
        System.out.println("thread.interrupt");
        interruptedThread.interrupt();
    }
}
