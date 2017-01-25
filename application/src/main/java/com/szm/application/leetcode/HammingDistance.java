/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.szm.application.leetcode;

/**
 * https://leetcode.com/problems/hamming-distance/
 * @auther sunzanmei
 * @date 17/1/25
 */
/**
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 Given two integers x and y, calculate the Hamming distance.

 Note:
 0 ≤ x, y < 231.

 Example:
 Input: x = 1, y = 4
 Output: 2

 Explanation:
 1   (0 0 0 1)
 4   (0 1 0 0)
        ↑   ↑
 The above arrows point to positions where the corresponding bits are different.
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int result = 0;

        byte[] xorStr = Integer.toBinaryString(xor).getBytes();
        for(byte item : xorStr){
            if('1' == item){
                result ++;
            }
        }
//        int toAnd = 1;
//        while (toAnd <= xor){
//            if ((xor & toAnd) != 0){
//                result ++;
//            }
//            toAnd *= 2;
//        }
//        while (xor >= 2){
//            result ++;
//            xor = xor >> 1;
//        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(3 | 5);
        System.out.println(3 & 5);
        System.out.println(3 ^ 5);
        System.out.println( 3 >> 1);
        System.out.println(new HammingDistance().hammingDistance(93,73));
    }
}
