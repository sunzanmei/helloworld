/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.szm.application.algrothem.common;

import com.alibaba.fastjson.JSONObject;

/**
 * @auther sunzanmei
 * @date 17/10/11
 */
public class SingleLinkedList {
    private SingleLinkedList next;
    private int data;



    public SingleLinkedList initOneLinkedList(){
        SingleLinkedList head = new SingleLinkedList();
        SingleLinkedList tail = new SingleLinkedList();
        head.setData(1);
        tail.setData(2);

        head.setNext(tail);

        for (int i = 3; i < 13; i++){
            SingleLinkedList item = new SingleLinkedList();
            item.setData(i);
            tail.setNext(item);
            tail=item;
        }
        return head;
    }

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        SingleLinkedList one = singleLinkedList.initOneLinkedList();
        System.out.println(JSONObject.toJSON(one).toString());
    }

    public SingleLinkedList(SingleLinkedList next, int data) {
        this.next = next;
        this.data = data;
    }

    public SingleLinkedList() {
    }

    public SingleLinkedList getNext() {
        return next;
    }

    public void setNext(SingleLinkedList next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
