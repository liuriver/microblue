package com.microblue.biz.Service;

import java.util.List;

import com.microblue.dal.entity.UserInfo;

public interface UserService
{

	boolean Login(String userName, String password);
	
	int addUser(UserInfo user);
	
	boolean updateUser(String id, UserInfo user);
	
	boolean deleteUser(String id);
	
	UserInfo findById(String id);
	
	UserInfo findByName(String name);
	
	List<UserInfo> findList(UserInfo user);
	
}
