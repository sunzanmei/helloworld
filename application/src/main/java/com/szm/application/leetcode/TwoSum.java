/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.szm.application.leetcode;

/**
 * @auther sunzanmei
 * @date 17/1/25
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length <= 1){
            return null;
        }
        int [] result = new int[2];
        if(nums.length == 2){
            if(nums[0] + nums[1] != target){
                return null;
            }
            result[0] = 0;
            result[1] = 1;
        }
        for (int i = 0; i < nums.length; i ++){
            for (int j = i + 1; j < nums.length; j ++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        //two sum
    }
}
