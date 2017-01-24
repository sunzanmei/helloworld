/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.szm.application.thread;

/**
 * @auther sunzanmei
 * @date 16/11/23
 */
class ThreadGroupTest extends Thread {
    boolean stopped;

    ThreadGroupTest(ThreadGroup tg, String name) {
        super(tg, name);
        stopped = false;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting.");
        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(".");
                Thread.sleep(250);
                synchronized (this) {
                    if (stopped)
                        break;
                }
            }
        } catch (Exception exc) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " exiting.");
    }

    synchronized void myStop() {
        stopped = true;
    }

    public static void main(String args[]) throws Exception {
        ThreadGroup tg = new ThreadGroup("My Group");

        ThreadGroupTest thrd = new ThreadGroupTest(tg, "MyThread #1");
        ThreadGroupTest thrd2 = new ThreadGroupTest(tg, "MyThread #2");
        ThreadGroupTest thrd3 = new ThreadGroupTest(tg, "MyThread #3");

        thrd.start();
        thrd2.start();
        thrd3.start();
        System.out.println(tg.activeGroupCount());

        Thread.sleep(1000);

        System.out.println(tg.activeCount() + " threads in thread group.");

        Thread thrds[] = new Thread[tg.activeCount()];
        tg.enumerate(thrds);
        for (Thread t : thrds)
            System.out.println(t.getName());

        thrd.myStop();

        Thread.sleep(1000);

        System.out.println(tg.activeCount() + " threads in tg.");
        tg.interrupt();
    }
}
