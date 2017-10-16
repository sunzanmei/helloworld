/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.szm.web.persistence.dao;

import com.szm.web.persistence.entity.User;

/**
 * @auther sunzanmei
 * @date 17/3/6
 */
public interface UserDao {

    User selectUserById(Integer id);
}
