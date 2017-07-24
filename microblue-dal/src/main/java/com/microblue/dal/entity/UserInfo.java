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
	private Integer mobilePhone;
	
	/**
	 * 用户名
	 */
	private String userName;
	
	/**
	 * 密码
	 */
	private String password;
	
	
	
	private Integer isLogin;


	public Integer getMobilePhone()
	{
		return mobilePhone;
	}

	public void setMobilePhone(Integer mobilePhone)
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


	public Integer getIsLogin()
	{
		return isLogin;
	}

	public void setIsLogin(Integer isLogin)
	{
		this.isLogin = isLogin;
	}

	@Override
	public String tableName()
	{
		return "user_info";
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("UserInfo [mobilePhone=");
		builder.append(mobilePhone);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", password=");
		builder.append(password);
		builder.append(", isLogin=");
		builder.append(isLogin);
		builder.append("]");
		return builder.toString();
	}
	
	
}
