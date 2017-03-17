package com.microblue.dal.entity;

/**
 * 用户类
 * @author liujiang
 *
 */
public class UserInfo extends BaseEntity
{
	
	
	/**
	 * 手机
	 */
	private int mobilePhone;
	
	/**
	 * 用户名
	 */
	private String userName;
	
	/**
	 * 密码
	 */
	private String password;
	
	
	
	private int isLogin;


	public int getMobilePhone()
	{
		return mobilePhone;
	}

	public void setMobilePhone(int mobilePhone)
	{
		this.mobilePhone = mobilePhone;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}


	public int getIsLogin()
	{
		return isLogin;
	}

	public void setIsLogin(int isLogin)
	{
		this.isLogin = isLogin;
	}

	@Override
	public String tableName()
	{
		return "user_info";
	}
	
	
}
