package com.microblue.dal.Dao.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microblue.dal.Dao.UserDao;
import com.microblue.dal.entity.UserInfo;

@Service
public class UserDaoImpl extends BaseDao implements UserDao
{
	@Override
	public int addUser(UserInfo user)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updateUser(String id, UserInfo user)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(String id)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserInfo findById(String id)
	{
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public UserInfo findByName(String name)
	{
		return this.getSqlSession().selectOne("", name);
	}

	@Override
	public List<UserInfo> findList(UserInfo user)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfo findOne(UserInfo user)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
}
