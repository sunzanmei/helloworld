/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.szm.thread;

/**
 * @auther sunzanmei
 * @date 16/11/19
 */
public class ThreadLocalTest {
    private static final ThreadLocal<Integer> value = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

//    private static final ThreadLocal<String> strValue = new ThreadLocal<String>(){
//        @Override
//        protected String initialValue(){
//            return "empty";
//        }
//    };

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new MyThread(i)).start();
        }
    }
    static class MyThread implements Runnable {
        private int index;
        public MyThread(int index) {
            this.index = index;
        }
        public void run() {
//            System.out.println("线程" + index + "的初始value:" + value.get()+"; 初始串："+strValue.get());
            for (int i = 0; i < 10; i++) {
                value.set(value.get() + i);
            }
           // strValue.set("非空");
//            System.out.println("线程" + index + "的累加value:" + value.get() + "; 最终串："+ strValue.get());


        }
    }
}
