/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.szm.application.algrothem;

import java.util.Collections;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Joiner;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.szm.application.algrothem.common.SingleLinkedList;

/**
 * 摩拜-面试题【产品研发-java开发（1小时）】
 * @auther sunzanmei
 * @date 17/10/11
 */
public class MoBaiCode {

    /**
     * 1.用熟悉的语言，编程实现Fibonacci 数列: int F(int n);
     Fibonacci 数列递推式:  F(n)=F(n-1)+F(n-2)
     F(1)=1
     F(2)=2
     F(3)=3
     F(4)=5
     F(5)=8
     */
    public void validGetFibonacci(){
        List res0 = new Fibonacci().getFibonacci(0);
        List res1 = new Fibonacci().getFibonacci(1);
        List res2 = new Fibonacci().getFibonacci(2);
        List res3 = new Fibonacci().getFibonacci(3);
        List res4 = new Fibonacci().getFibonacci(4);
        List res5 = new Fibonacci().getFibonacci(5);

        System.out.println(Joiner.on(",").join(res0));
        System.out.println(Joiner.on(",").join(res1));
        System.out.println(Joiner.on(",").join(res2));
        System.out.println(Joiner.on(",").join(res3));
        System.out.println(Joiner.on(",").join(res4));
        System.out.println(Joiner.on(",").join(res5));
    }

    /**
     * 给定两个牌号的数组A，B，请写出一个函数，从中找出他们的公共元素: findCommon（A,B）；并列举几种可能的查找方法；例如：
     Array A={1,3,5,6,9}
     Array B={2,3,6,8,10}
     返回结果={3,6}
     */
    public List<Integer> findCommon(List<Integer> A, List<Integer> B){
        int bIndex = 0;
        List res = Lists.newArrayList();

        if (A == null || B == null || A.size() == 0 || B.size() == 0){
            return res;
        }

        for (int item:A) {
            while(item > B.get(bIndex) && bIndex < B.size()-1){
                bIndex ++;
            }
            if (item == B.get(bIndex)){
                res.add(item);
            }
        }
        return res;
    }

    public void validFindCommon(){
        List<Integer> A = Lists.newArrayList(1,3,5,6,9);
        List<Integer> B = Lists.newArrayList(2,3,6,8,10);
        List<Integer> res = new MoBaiCode().findCommon(A, B);
         System.out.println(Joiner.on(",").join(res));
    }
    /**
     * 给定一个单链表 A，链表结构如下：
     class SingleLinkedList{
     SingleLinkedList*next;
     int data;
     {
     写一个倒置这个链表的函数（或者其他语言）：
     SingleLinkedList*reverse(SingleLinkedList*A)

     * @return
     */
    public void validInverse() {
        SingleLinkedList singleObj = new SingleLinkedList();
        SingleLinkedList origin = singleObj.initOneLinkedList();
        System.out.println("before: " + JSONObject.toJSON(origin).toString());

        SingleLinkedList afterInvers = new SingleLinkedListOp().inverse(origin);

        System.out.println("after: "+ JSONObject.toJSON(afterInvers).toString());
    }

    /**
     * Find smallest substring in a string that contains all characters in a set.
     Give you a string of characters(A-Z) called S, and a set of characters(A-Z) called T. Find the smallest
     substring in S that includes all characters in T.
     For example:
     String S=’ADOBECODEBANC’
     And the set T={A,B,C}
     The smallest substring is BANC
     * @param args
     */


    public static void main(String[] args) {
        new MoBaiCode().validGetFibonacci();
        new MoBaiCode().validInverse();
        new MoBaiCode().validFindCommon();
    }
}
