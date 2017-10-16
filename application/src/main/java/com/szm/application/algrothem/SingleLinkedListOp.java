/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.szm.application.algrothem;

import com.alibaba.fastjson.JSONObject;
import com.szm.application.algrothem.common.SingleLinkedList;

/**
 * @auther sunzanmei
 * @date 17/10/11
 */
public class SingleLinkedListOp {
    /**
     * 给定一个单链表 A，链表结构如下：
     class SingleLinkedList{
     SingleLinkedList*next;
     int data;
     {
     写一个倒置这个链表的函数（或者其他语言）：
     SingleLinkedList*reverse(SingleLinkedList*A)

     * @param head
     * @return
     */
    public SingleLinkedList inverse(SingleLinkedList head){
        if (head == null){
            return null;
        }
        if (head.getNext() == null){ // 如果只有一个元素，不需要逆转
            return head;
        }

        SingleLinkedList prev = null;
        SingleLinkedList cur = head;
        SingleLinkedList next = head.getNext();

        while (cur.getNext() != null){
            cur.setNext(prev);
            prev = cur;
            cur = next;
            next = next.getNext();
        }
        cur.setNext(prev);

        return cur;
    }

    public static void main(String[] args) {
        SingleLinkedList singleObj = new SingleLinkedList();
        SingleLinkedList origin = singleObj.initOneLinkedList();
        System.out.println("before inverse: " + JSONObject.toJSON(origin).toString());

        SingleLinkedList afterInvers = new SingleLinkedListOp().inverse(origin);

        System.out.println("after inverse: "+ JSONObject.toJSON(afterInvers).toString());
    }
}
