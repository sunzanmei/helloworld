/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.szm.web.persistence.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szm.web.persistence.dao.UserDao;
import com.szm.web.persistence.entity.User;
import com.szm.web.persistence.mapper.UserMapper;

/**
 * @auther sunzanmei
 * @date 17/3/7
 */
@Service("userDao")
public class UserDaoImpl implements UserDao{

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据id查找
     * @param id
     * @return
     */
    public User selectUserById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }
}
