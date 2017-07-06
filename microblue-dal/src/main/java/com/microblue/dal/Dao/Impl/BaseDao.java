package com.microblue.dal.Dao.Impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Component;

@Component
public class BaseDao extends SqlSessionDaoSupport
{
	@Override
	@Resource
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
	{
		super.setSqlSessionFactory(sqlSessionFactory);
	}
}
