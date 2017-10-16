/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.szm.application;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

/**
 * @auther sunzanmei
 * @date 16/11/30
 */
public class Hello {
    public static void main(String[] args) {
//        Long i = null;
//        Long j = 1L;
//        System.out.println(i+j);

//        List<String> originList;
//
//            int b;
//            try {
//                System.out.println("please Input:");
//                while ((b = System.in.read()) != -1) {
////                    try {
////                        Thread.sleep(1000);
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
//                    System.out.println((char) b);
//                }
//            } catch (IOException e) {
//                System.out.println(e.toString());
//            }
//
//
//        List<User> userList = Lists.newArrayList();
//
//        for(int i = 1; i < 10; i ++){
//            User user = new User();
//            user.setId(i);
//            user.setName("name"+i);
//            userList.add(user);
//        }
//        System.out.println(Joiner.on(",").join(userList));
//
//        Map<Integer, User> userMap = Maps.newHashMap();
//        for(User user : userList){
//            userMap.put(user.getId(), user);
//        }
//
//        for(User user : userList){
//            userMap.get(user.getId()).setAge(10);
//        }
//
//        System.out.println(Joiner.on(",").join(userList));
//
//
//        List<User> newList = Lists.newArrayList();
//        for(User user : userList){
//            newList.add(user);
//        }
//
//        for(User user : newList){
//            user.setAge(20);
//        }
//
//        System.out.println(Joiner.on(",").join(userList));
//        System.out.println(Joiner.on(",").join(newList));
//
//        for (User user: userList){
//            user.setAge(10);
//        }
//
//        System.out.println(Joiner.on(",").join(userList));


        String regex = "(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])"
                + "-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|<null>";

        String text = "{\"0time\":\"1487577482\",\"depth\":\"0\",\"fileName\":\"JCLLoggerAdapter.java\",\"interfaceName\":\"org.slf4j.impl.JCLLoggerAdapter.info\",\"isTreeNode\":\"false\",\"level\":\"INFO\",\"line\":\"263\",\"logId\":\"100024_9c1d4e21-3cb6-45e4-a5fc-b8af97b52aaa\",\"logSrcId\":\"100024\",\"logType\":\"log4j\",\"loggerName\":\"com.baidu.fsg.csp.web.controller.workorder.WorkOrderController\",\"loginId\":\"4b04edf48afe037a356a802ed54240353dcb9f221abc57c986abb32bd0b1816fbfd56a24a0a22b11d8412720\",\"msg\":\"queryWorkOrderLog:WorkOrderQueryParam[id=<null>,prodLine1Id=<null>,prodLine2Id=<null>,contactName=<null>,clientName=<null>,contactId=<null>,clientId=<null>,statusStr=<null>,statusCode=<null>,creatorName=<null>,creatorId=<null>,resolveGroupStr=<null>,resolveGroupId=<null>,resolveUserName=<null>,resolveUserId=<null>,businessEventType=<null>,callBack=0,0=<null>,createTimeEnd=<null>,finishTimeBegin=<null>,finishTimeEnd=<null>,bpmProcessId=1487133856780335128_fsg_csp_pkg_1142_prs1,processIds=<null>,operatorIds=<null>,operatorName=<null>,ownProcessIds=<null>,needActions=1,pageTotal=0,createUserIds=<null>,proEventCode=<null>,createFeedbackId=<null>,dicType=<null>,proEventIdList=<null>,proEventId=<null>,walletUid=<null>,workOrderPriority=<null>,merchantId=<null>,orderBy=<null>,orderDir=<null>,proline2IdList=<null>,total=0,pageSize=10,list=<null>]\",\"nodeAddress\":\"10.92.187.54\",\"parentId\":\"1\",\"proccessId\":\"252\",\"requestId\":\"9786279493783191490\",\"sequenceId\":\"22\",\"startTime\":\"1487577482722\",\"threadId\":\"77\",\"threadName\":\"http-bio-8080-exec-44\",\"version\":\"1\"}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if(matcher.find()){
            for(int i = 0; i < matcher.groupCount(); i ++) {
                System.out.println(matcher.group(i));
            }
        }


    }
}
