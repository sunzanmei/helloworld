/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.szm.application.algrothem;

import java.util.HashMap;

import com.alibaba.fastjson.JSONObject;
import com.sun.tools.javac.util.StringUtils;

/**
 * @auther sunzanmei
 * @date 17/10/12
 */
public class MinWindowSubstring {
    /**
     * 两个指针，哈希表保存当前经过的数组。。。
     * 经过的字符，如果包含在T中，那么对应的计数-1，使用count表示有效计数（也就是T的长度），当计数减去后大于等于0的（注意可以小于0），就证明T中还有有待匹配的，那么count也跟着减，当count=0的时候p-q之间肯定有答案。
     * 如果p-q之间，正好满足了T的要求，那么就按照长度进行更新就可以。。。注意p的位置要记得调整到合适的，此时将p调整到第一个count不为0之前，如何确定count不为0，之前不是有计数的么，那么p在前进过程中，如果遇到T中没有的额就直接前进，如果遇到的是T包含的，但是计数小于0，那么p也可以继续前进，只需将对应的字符计数++就可以。
     *
     */
    public String minWindow(String source, String target) {
        char S[]=source.toCharArray();
        char T[]=target.toCharArray();
        String result="";
        //字符计数，只记录T里面的，并且做一个初始的技术
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<T.length;i++){
            if(map.containsKey(T[i])==false){
                map.put(T[i],0);
            }
            map.put(T[i],map.get(T[i])+1);
        }
        System.out.println("target map:");
        System.out.println(JSONObject.toJSONString(map));
        int count=T.length,p=0,q=0;  //注意count是必须要匹配的个数
        //移动q
        System.out.println("begin find count: "+count);
        while(q<S.length){
            /**
             * 如果q对应的位置的S的字符，在T中出现，那么计数-1
             * 注意有效的count--是需要剪完后仍然大于0的，也就是还满足T的要求的
             * */
            if(map.containsKey(S[q])){
                int tmp=map.get(S[q]);
                if(tmp>0)
                    count--;
                map.put(S[q],tmp-1);

                System.out.println("contais "+S[q]+" map:");
                System.out.println(JSONObject.toJSONString(map));
            }
            q++;
            System.out.println("end map.containsKey, index: "+q+",get count: "+count);
            //count=0的时候证明，已经有了能匹配T的字串了，此时移动p，到刚好能满足这个位置q的最小位置就可以
            if(count==0){
                while(p<q && count==0){
                    System.out.println("in wile p<q && count==0");
                    if(map.containsKey(S[p])==true){
                        System.out.println("in if map.containsKey(S[p])==true, map:"+JSONObject.toJSONString(map)+", "
                                + "S[p]:"+S[p]+", map.get(S[p]):"+map.get(S[p]));
                        int tmp=map.get(S[p]);
                        if(tmp>=0){
                            if(result.equals("") || result.length()>=q-p){
                                result=source.substring(p,q);
                            }
                            count++;
                        }
                        map.put(S[p],tmp+1);
                    }
                    p++;
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        String source = "ADOBECODEBANC";
        String target = "AABC";
        System.out.println(new MinWindowSubstring().minWindow(source,target));
    }
}
