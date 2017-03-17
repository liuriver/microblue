package com.microblue.dal.entity;

import java.util.Date;
/**
 * 
 * 2017
 * @see microblue-dal
 * @author liujiang admin
 * @Date 2017年3月17日
 */
public abstract class BaseEntity
{

	/**
	 * id
	 */
	private String uuid;

	private int id;

	private Date createTime;

	private Date modifyTime;

	private int isDeleted;

	public String getUuid()
	{
		return uuid;
	}

	public void setUuid(String uuid)
	{
		this.uuid = uuid;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Date getCreateTime()
	{
		return createTime;
	}

	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
	}

	public Date getModifyTime()
	{
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime)
	{
		this.modifyTime = modifyTime;
	}

	public int getIsDeleted()
	{
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted)
	{
		this.isDeleted = isDeleted;
	}
	
	public abstract String tableName();
}
