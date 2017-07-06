package com.microblue.dal.Dao;

import java.util.List;

import com.microblue.dal.entity.UserInfo;

public interface UserDao
{
	int addUser(UserInfo user);

	boolean updateUser(String id, UserInfo user);

	boolean deleteUser(String id);

	UserInfo findById(String id);

	UserInfo findByName(String name);

	List<UserInfo> findList(UserInfo user);
	
	UserInfo findOne(UserInfo user);
}
