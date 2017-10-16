/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.szm.application.leetcode;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

/**
 * @auther sunzanmei
 * @date 17/2/8
 */
public class KeyBoardRow {
    public String[] findWords(String[] words) {
        String strOne = "qwertyuiopQWERTYUIOP";
        String strTwo = "asdfghjklASDFGHJK";
        String strThree = "zxcvbnmZXCVBNM";

        List<String> resultList = new ArrayList<String>();
        String[] output = new String[]{};
        int index = 0;
        for(String word : words){
            if(word == null || word.equals("")){
                continue;
            }

            char[] items = word.toCharArray();
            char first = items[0];
            boolean isOutput = true;
            if(strOne.contains(String.valueOf(first))){
                for(char item : items){
                    if(!strOne.contains(String.valueOf(item))){
                        isOutput = false;
                        break;
                    }
                }
//                resultList.add(word);
                if(isOutput) {
                    resultList.add(word);
                }
                continue;
            }

            if(strTwo.contains(String.valueOf(first))){
                for(char item : items){
                    if(!strTwo.contains(String.valueOf(item))){
                        isOutput = false;
                        break;
                    }
                }
                //                resultList.add(word);
                if(isOutput) {
                    resultList.add(word);
                }
                continue;
            }

            if(strThree.contains(String.valueOf(first))){
                for(char item : items){
                    if(!strThree.contains(String.valueOf(item))){
                        isOutput = false;
                        break;
                    }
                }
                //                resultList.add(word);
                if(isOutput) {
                    resultList.add(word);
                }
                continue;
            }

        }
        output = new String[output.length];
        for (int i = 0; i < output.length;i++){
            output[i] = resultList.get(i);
        }
        return output ;

    }

    public static void main(String[] args) {
        String[] input = new String[]{"Hello","Alaska","Dad","Peace"};
        String[] output = new KeyBoardRow().findWords(input);
        System.out.println(Joiner.on(",").join(output));
    }
}
