package com.microblue.biz.Service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.microblue.biz.Service.UserService;
import com.microblue.dal.Dao.UserDao;
import com.microblue.dal.entity.UserInfo;

@Service
public class UserServiceImpl implements UserService
{

	@Resource(name="userDaoImpl")
	private UserDao userDao;
	
	@Override
	public boolean Login(String userName, String password)
	{
		UserInfo findByName = userDao.findByName(userName);
		
		if(null != findByName)
		{
			return findByName.getPassword().equals(password);
		}
		return false;

	}

	@Override
	public int addUser(UserInfo user)
	{
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	@Override
	public boolean updateUser(String id, UserInfo user)
	{
		// TODO Auto-generated method stub
		return userDao.updateUser(id, user);
	}

	@Override
	public boolean deleteUser(String id)
	{
		// TODO Auto-generated method stub
		return userDao.deleteUser(id);
	}

	@Override
	public UserInfo findById(String id)
	{
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}

	@Override
	public UserInfo findByName(String name)
	{
		// TODO Auto-generated method stub
		return userDao.findByName(name);
	}

	@Override
	public List<UserInfo> findList(UserInfo user)
	{
		// TODO Auto-generated method stub
		return userDao.findList(user);
	}

}
