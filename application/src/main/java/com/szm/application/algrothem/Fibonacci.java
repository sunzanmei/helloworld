/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.szm.application.algrothem;

import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

/**
 * @auther sunzanmei
 * @date 17/10/11
 */
public class Fibonacci {
    public List getFibonacci(int num){
        List<Integer> res = Lists.newArrayList();
        if (num <= 0){
            return res;
        }
        res.add(1);
        if (num > 1){
            res.add(2);
        }
        for (int i = 3; i <= num; i++){
            res.add(res.get(i-2) + res.get(i-3));
        }
        return res;
    }

    public static void main(String args[]){
        List res0 = new Fibonacci().getFibonacci(0);
        List res1 = new Fibonacci().getFibonacci(1);
        List res2 = new Fibonacci().getFibonacci(2);
        List res3 = new Fibonacci().getFibonacci(3);
        List res4 = new Fibonacci().getFibonacci(4);
        List res5 = new Fibonacci().getFibonacci(5);
        List res6 = new Fibonacci().getFibonacci(6);

        System.out.println(Joiner.on(",").join(res0));
        System.out.println(Joiner.on(",").join(res1));
        System.out.println(Joiner.on(",").join(res2));
        System.out.println(Joiner.on(",").join(res3));
        System.out.println(Joiner.on(",").join(res4));
        System.out.println(Joiner.on(",").join(res5));
    }
}
