/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.szm.application.thread;

/**
 * @auther sunzanmei
 * @date 16/11/19
 */
public class NoVisibility {


    private static class ReaderThread extends Thread{
        private static boolean ready;
        private static int number;

        public void run(){
            while(!ready){
                Thread.yield();
            }
            System.out.println(number);
        }

        private void setNumber(int number1){
            try {
                Thread.currentThread().sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            number = number1;
        }
        private void setReady(boolean ready1){
            ready = ready1;
        }

    }

    public static void main(String[] args) {
        for(int i = 1; i < 100; i++) {
            ReaderThread thread = new ReaderThread();
            thread.start();
            thread.setNumber(42);
            thread.interrupt();
            thread.setReady(true);
        }
    }
}
