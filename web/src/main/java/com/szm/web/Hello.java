/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.szm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.szm.web.persistence.dao.UserDao;

/**
 * @auther sunzanmei
 * @date 17/3/1
 */
@Service("hello")
public class Hello {

    @Transactional
    public void add(boolean throwException)throws Exception {
        // TODO Auto-generated method stub
        if(throwException) {
            throw new Exception("exception from add");
        }

    }


    @Transactional
    public void sub(boolean throwException) throws Exception {
        if(throwException) {
            throw new Exception("exception from sub");
        }
    }

    @Transactional
    public void test() throws Exception {
        try {
            this.add(true);
            this.sub(true);
        } catch (Exception e) {
            e.printStackTrace();
            // throw e;
        }

    }

    @Autowired
    private UserDao userDao;


    public static void main(String[] args) {
        System.out.println("hello");
        ApplicationContext context = new ClassPathXmlApplicationContext(new
                String[]{"classpath:/mvc/applicationContext.xml"});
        Hello controller = (Hello) context.getBean("hello");

    }
}
