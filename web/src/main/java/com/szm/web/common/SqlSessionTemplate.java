/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.szm.web.common;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.MyBatisExceptionTranslator;

/**
 * 实现描述：SQL Session
 * 
 * @author chaoyi.he
 * @version v1.0.0
 * @see
 * @since 2013年11月14日 下午8:54:23
 */
public class SqlSessionTemplate extends org.mybatis.spring.SqlSessionTemplate {

    /**
     * @param sqlSessionFactory
     */
    public SqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        super(sqlSessionFactory, sqlSessionFactory.getConfiguration().getDefaultExecutorType(),
                new MyBatisExceptionTranslator(sqlSessionFactory.getConfiguration().getEnvironment().getDataSource(),
                        true));
    }

}
